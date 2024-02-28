package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MathActivity extends AppCompatActivity {

    private TextView questionTextView;
    private Button option1Button, option2Button, option3Button, option4Button;
    private TextView scoreTextView;
    private String currentQuestion;
    private String[] currentOptions;
    private int correctAnswerIndex;

    private String[] questions = {
            "2 * 2 =",
            "3 * 1 =",
            "5 * 2 =",
            "4 * 3 =",
            "3 * 3 =",
            "6 * 2 =",
            "2 * 3 =",
            "4 * 5 =",
            "6 * 5 =",
            "1 * 1 =",
            };

    private String[][] options = {
            {"3", "4", "5", "1"},
            {"4", "2", "3", "5"},
            {"6", "12", "7", "10"},
            {"12", "5", "6", "10"},
            {"6", "8", "9", "7"},
            {"8", "9", "10", "12"},
            {"8", "5", "6", "3"},
            {"20", "15", "25", "16"},
            {"24", "36", "35", "30"},
            {"3", "1", "0", "2"},
            };

    private int[] correctAnswers = {1, 2,3,0,2,3,2,0,3,1};

    private int currentQuestionIndex = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        questionTextView = findViewById(R.id.questionTextView);
        option1Button = findViewById(R.id.option1Button);
        option2Button = findViewById(R.id.option2Button);
        option3Button = findViewById(R.id.option3Button);
        option4Button = findViewById(R.id.option4Button);
        scoreTextView = findViewById(R.id.scoreTextView);

        Button btn3 = findViewById(R.id.btnBack2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MathActivity.this,LearnActivity.class));
            }
        });

        option1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(0);
            }
        });

        option2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(1);
            }
        });

        option3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(2);
            }
        });

        option4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(3);
            }
        });

        // Rest of your onCreate code...

        if (savedInstanceState != null) {
            // Retrieve score, current question index, current question, and current options from the savedInstanceState bundle
            score = savedInstanceState.getInt("score",0);
            currentQuestionIndex = savedInstanceState.getInt("currentQuestionIndex",0);
            currentQuestion = savedInstanceState.getString("currentQuestion","");
            currentOptions = savedInstanceState.getStringArray("currentOptions");
            scoreTextView.setText(score + "/" + currentQuestionIndex);

        } else {
            // If there is no saved instance state, start the quiz from the first question
            showQuestion(0);
        }

        // Display the first question
        showQuestion(currentQuestionIndex);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save score, current question index, current question, and current options in the outState bundle
        outState.putInt("score", score);
        outState.putInt("currentQuestionIndex", currentQuestionIndex);
        outState.putString("currentQuestion", currentQuestion);
        outState.putStringArray("currentOptions", currentOptions);
    }

    private void showQuestion(int questionIndex) {
        currentQuestion = questions[questionIndex];
        currentOptions = options[questionIndex];
        correctAnswerIndex = correctAnswers[questionIndex];

        questionTextView.setText(currentQuestion);
        option1Button.setText(currentOptions[0]);
        option2Button.setText(currentOptions[1]);
        option3Button.setText(currentOptions[2]);
        option4Button.setText(currentOptions[3]);
    }

    private void checkAnswer(int chosenAnswerIndex) {
        if (chosenAnswerIndex == correctAnswerIndex) {
            // Correct answer
            score++;
        }

        // Update score text
        scoreTextView.setText(score + "/" + (currentQuestionIndex + 1));

        // Move to the next question
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            showQuestion(currentQuestionIndex);
        }
        else
        {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("score", score);
            intent.putExtra("questionNumber", currentQuestionIndex);
            startActivity(intent);
        }
    }
}