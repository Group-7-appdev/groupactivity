package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Update extends AppCompatActivity {

    EditText update_idno;
    EditText update_name;
    EditText update_address;

    String stidno;
    String stName;
    String stAddress;

    List<POJO> studentDetails;
    OpenHelper openHelper;
    SQLiteDatabase sqLiteDatabase;

    int rowId=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        openHelper = new OpenHelper(this);
        sqLiteDatabase = openHelper.getWritableDatabase();

        update_idno = findViewById(R.id.idno_update);
        update_name = findViewById(R.id.name_update);
        update_address = findViewById(R.id.address_update);

        rowId = getIntent().getIntExtra("stuId", -1);

        Cursor cursor = sqLiteDatabase.query(DBInfo.TABLE_NAME, null, DBInfo._ID + " = " + rowId, null, null,null, null);
        studentDetails = new ArrayList<POJO>();
        studentDetails.clear();

        if(cursor != null && cursor.getCount() != 0) {
            while(cursor.moveToNext()) {
                update_idno.setText(cursor.getString(cursor.getColumnIndex(DBInfo.IDNO)));
                update_name.setText(cursor.getString(cursor.getColumnIndex(DBInfo.StudentName)));
                update_address.setText(cursor.getString(cursor.getColumnIndex(DBInfo.StudentAddress)));
            }
        }
        else {
            Toast.makeText(this, "No Data Found!", Toast.LENGTH_SHORT).show();
        }

    }
    public void clickUpdate(View view) {
        stidno = update_idno.getText().toString();
        stName = update_name.getText().toString();
        stAddress = update_address.getText().toString();

        if (TextUtils.isEmpty(stidno) || TextUtils.isEmpty(stName) || TextUtils.isEmpty(stAddress)) {
            Toast.makeText(this, "Check the Empty Fields", Toast.LENGTH_LONG).show();
        }
        else {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DBInfo.IDNO, stidno);
            contentValues.put(DBInfo.StudentName, stName);
            contentValues.put(DBInfo.StudentAddress, stAddress);

            int updateId = sqLiteDatabase.update(DBInfo.TABLE_NAME, contentValues, DBInfo._ID + " = " + rowId, null);
            if(updateId != -1) {
                Toast.makeText(this, "Successfully Updated", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }
            else {
                Toast.makeText(this, "Something Wrong!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        sqLiteDatabase.close();
        super.onDestroy();
    }
}