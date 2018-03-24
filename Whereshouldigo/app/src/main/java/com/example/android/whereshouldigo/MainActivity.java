package com.example.android.whereshouldigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.bole);
        button2 = (Button) findViewById(R.id.piassa);
        button3 = (Button) findViewById(R.id.gerji);
        button4 = (Button) findViewById(R.id.bole_michael);
        button5 = (Button) findViewById(R.id.welosefer);
        button6 = (Button) findViewById(R.id.hayahulet);


        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Bole.class);
                startActivity(myIntent);
            }
        });


        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Piassa.class);
                startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Gerji.class);
                startActivity(myIntent);
            }
        });

        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Bole_michael.class);
                startActivity(myIntent);
            }
        });

        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Welosefer.class);
                startActivity(myIntent);
            }
        });

        button6.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Hayahulet.class);
                startActivity(myIntent);
            }
        });
    }
}
