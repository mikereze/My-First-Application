package com.example.android.whereshouldigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Bole extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bole);

        button1 = (Button) findViewById(R.id.bole_btn1);
        button2 = (Button) findViewById(R.id.bole_btn2);
        button3 = (Button) findViewById(R.id.bole_btn3);
        button4 = (Button) findViewById(R.id.bole_btn4);
        button5 = (Button) findViewById(R.id.bole_btn5);


        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Bole.this,
                        Romina.class);
                startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Bole.this,
                        Wow.class);
                startActivity(myIntent);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Bole.this,
                        Angla.class);
                startActivity(myIntent);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Bole.this,
                        In_n_out.class);
                startActivity(myIntent);
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Bole.this,
                        Cade.class);
                startActivity(myIntent);
            }
        });


    }


}
