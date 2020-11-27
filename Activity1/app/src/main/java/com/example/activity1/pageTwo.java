package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class pageTwo extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        display = findViewById(R.id.txtdisplay);


        SharedPreferences sharedPref = getApplication().getSharedPreferences("My Prefs", Context.MODE_PRIVATE);
        String uname = sharedPref.getString("Prefuser", "");

        display.setText("Welcome "+uname);
    }
}