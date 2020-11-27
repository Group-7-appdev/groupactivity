package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username, password;
    Button save, log;
    SharedPreferences sharedPref;
    String userStr, passStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        save = findViewById(R.id.savebtn);
        log = findViewById(R.id.logbtn);


        sharedPref=getApplicationContext().getSharedPreferences("My Prefs", Context.MODE_PRIVATE);

        save.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {




                userStr = username.getText().toString();
                passStr= password.getText().toString();

                if (userStr.isEmpty() || passStr.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Username and Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    SharedPreferences.Editor editor = sharedPref.edit();

                    editor.putString("Prefuser", userStr);
                    editor.putString("Prefpass", passStr);
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "Saved Succesfully", Toast.LENGTH_SHORT).show();


                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userStr = username.getText().toString();
                passStr= password.getText().toString();

                if(userStr.isEmpty() || passStr.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Username and Password", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent(getApplicationContext(), pageTwo.class);
                    startActivity(intent);
                }
            }
        });



    }
}