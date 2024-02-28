package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    String congratulatoryMessage;
    String congratulatoryMessage1;

    int score;
    int questionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        congratulatoryMessage = getString(R.string.Congratulations_You_answered_all_questions_correctly);
        congratulatoryMessage1 = getString(R.string.Great_job_You_completed_the_quiz);

        Button btn3 = findViewById(R.id.btnBack9);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("custom-event"));
            }
        });

        // Retrieve score and question number from Intent
        score = getIntent().getIntExtra("score", 0);
        questionNumber = getIntent().getIntExtra("questionNumber", 0);

        // Display the score and question number
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("Score: " + score + "/" + questionNumber);

        // Display congratulatory message based on score
        TextView congratsTextView = findViewById(R.id.congratsTextView);
        if (score == questionNumber) {
            congratsTextView.setText(congratulatoryMessage);
        } else {
            congratsTextView.setText(congratulatoryMessage1);
        }
    }
}