package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity2 extends AppCompatActivity {

    String congratulatoryMessage;
    String congratulatoryMessage1;

    int score;
    int questionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        congratulatoryMessage = getString(R.string.Congratulations_You_answered_all_questions_correctly);
        congratulatoryMessage1 = getString(R.string.Great_job_You_completed_the_quiz);

        Button btn4 = findViewById(R.id.btnBack13);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity2.this,PlayActivity.class));
            }
        });

        // Retrieve score and question number from Intent
        int scoreNumber = getIntent().getIntExtra("scoreNumber", 0);
        int questionNumber = getIntent().getIntExtra("questionNumber", 0);

        // Display the score and question number
        TextView scoreTextView = findViewById(R.id.scoreTextView2);
        scoreTextView.setText("Score: " + scoreNumber + "/" + questionNumber);

        // Display congratulatory message based on score
        TextView congratsTextView = findViewById(R.id.congratsTextView2);
        if (scoreNumber == questionNumber) {
            congratsTextView.setText(congratulatoryMessage);
        } else {
            congratsTextView.setText(congratulatoryMessage1);
        }
    }
}