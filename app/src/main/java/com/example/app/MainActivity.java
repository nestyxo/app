package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView questionTV;
    Button truebtn, falsebtn, Finish;
    int Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTV = (TextView) findViewById(R.id.QuestionTV);
         truebtn = (Button) findViewById(R.id.truebtn);
         falsebtn = (Button) findViewById(R.id.falsebtn);
         Score = 0;

         truebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast myToast = Toast.makeText(getApplicationContext(), getString(R.string.right),Toast.LENGTH_LONG);
                 myToast.show();
                 Score = Score = 1;


             }
         });
         falsebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast myToast = Toast.makeText(getApplicationContext(),getString(R.string.wrong), Toast.LENGTH_SHORT);
                 myToast.show();

                 
             }
         });
         Finish.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent myIntent = new Intent(MainActivity.this, ScoreActivity.class);
                 myIntent.putExtra("score",Score);
                 startActivity(myIntent);

             }
         });
;
    }


    }
