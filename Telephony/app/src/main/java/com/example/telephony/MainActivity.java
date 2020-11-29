package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton btnsms1;
    ImageButton btnsms2;
    ImageButton btnsms3;
    ImageButton btnsms4;
    ImageButton btnsms5;
    ImageButton btnCall1;
    ImageButton btnCall2;
    ImageButton btnCall3;
    ImageButton btnCall4;
    ImageButton btnCall5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsms1 = findViewById(R.id.btn_message1);
        btnsms2 = findViewById(R.id.btn_message2);
        btnsms3 = findViewById(R.id.btn_message3);
        btnsms4 = findViewById(R.id.btn_message4);
        btnsms5 = findViewById(R.id.btn_message5);
        btnCall1 = findViewById(R.id.btn_call1);
        btnCall2 = findViewById(R.id.btn_call2);
        btnCall3 = findViewById(R.id.btn_call3);
        btnCall4 = findViewById(R.id.btn_call4);
        btnCall5 = findViewById(R.id.btn_call5);


        btnsms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09353100140";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        btnsms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09566809353";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        btnsms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09158381787";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        btnsms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09951959136";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });
        btnsms5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09509244149";
                Intent intent = new Intent(getApplicationContext(), sms.class);
                intent.putExtra("sms",Contact);
                startActivity(intent);
            }
        });


        btnCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09353100140";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        btnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09566809353";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        btnCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09158381787";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        btnCall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09951959136";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });
        btnCall5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contact = "09509244149";
                Intent intent = new Intent(getApplicationContext(), call.class);
                intent.putExtra("call",Contact);
                startActivity(intent);
            }
        });

    }

}