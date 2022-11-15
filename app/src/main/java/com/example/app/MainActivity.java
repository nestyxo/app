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
    int currentIndex;
    Question q1, q2, q3, q4, q5, currentQ;
    Question[] questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTV = (TextView) findViewById(R.id.QuestionTV);
         truebtn = (Button) findViewById(R.id.truebtn);
         falsebtn = (Button) findViewById(R.id.falsebtn);
         Finish = (Button) findViewById(R.id.Next);
         Score = 0;
         currentIndex=0;
         q1 = new Question(getString(R.string.q1text), true);
         q2 = new Question(getString(R.string.q2text), true);
         q3 = new Question(getString(R.string.q3text), false);
         q4 = new Question(getString(R.string.q4text), false);
         q5= new Question(getString(R.string.q4text), false);
         questions = new Question[] {q1, q2, q3, q4, q5};
         currentQ = questions[currentIndex];

         truebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (currentQ.getCorrectAnswer()==false) {
                     Toast myToast = Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT);
                     myToast.show();
                 } else {
                     Toast myToast = Toast.makeText(getApplicationContext(), getString(R.string.right),Toast.LENGTH_LONG);
                     myToast.show();
                     Score = Score + 1;
                 }

             }
         });
         falsebtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (currentQ.getCorrectAnswer()==true) {
                     Toast myToast = Toast.makeText(getApplicationContext(), getString(R.string.wrong), Toast.LENGTH_SHORT);
                     myToast.show();
                 } else {
                     Toast myToast = Toast.makeText(getApplicationContext(), getString(R.string.right),Toast.LENGTH_LONG);
                     myToast.show();
                     Score = Score + 1;
                 }
                 
             }
         });
         Finish.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 currentIndex = currentIndex + 1;
                 if (currentIndex > 4) {Intent myIntent = new Intent(MainActivity.this, ScoreActivity.class);
                     myIntent.putExtra("score",Score);
                     startActivity(myIntent);

                 }
                 else
                  { currentQ = questions[currentIndex];
                   questionTV.setText(currentQ.getQtext());

                 }

             }
         });
;
    }


    }
