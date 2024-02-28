package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RememberActivity extends AppCompatActivity {
    EditText editText;
    private Runnable delayRunnable;
    private Handler handler;

    Button buttonSubmit;
    TextView textView;
    TextView textView1;

    int currentQuestionIndex = 0;
    int Score = 0;

    private String[] questions = {
            "9",
            "35",
            "678",
            "8632",
            "67943",
            "168053",
            "9642671",
            "13462179",
            "864800632",
            "335785424"
    };

    private int[] correctAnswers = {
            9,
            53,
            876,
            2368,
            34976,
            350861,
            1762469,
            97126431,
            236008468,
            424587533
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remember);
        editText = findViewById(R.id.editAnswer);
        textView = findViewById(R.id.textScore3);
        textView1 = findViewById(R.id.textQuestion);
        buttonSubmit = findViewById(R.id.btnSubmit);
        Intent intent = new Intent(this, ResultActivity1.class);
        handler = new Handler();

        showQuestion(currentQuestionIndex);

        Button btn4 = findViewById(R.id.btnBack6);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RememberActivity.this,PlayActivity.class));
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // Remove any pending callbacks before scheduling a new one
                if (delayRunnable != null) {
                    handler.removeCallbacks(delayRunnable);
                }

                String text = editText.getText().toString();
                int answer = Integer.parseInt(text);

                if (answer == correctAnswers[currentQuestionIndex])
                {
                    editText.setText("");
                    Score++;
                    textView.setText(Score + "/" + (currentQuestionIndex + 1));
                    currentQuestionIndex++;
                    if (currentQuestionIndex < questions.length) {
                        showQuestion(currentQuestionIndex);
                    }
                    else
                    {
                        intent.putExtra("score", Score);
                        intent.putExtra("questionNumber", currentQuestionIndex);
                        startActivity(intent);
                    }
                }

                else
                {
                    editText.setText("");
                    textView.setText(Score + "/" + (currentQuestionIndex + 1));
                    currentQuestionIndex++;
                    if (currentQuestionIndex < questions.length) {
                        showQuestion(currentQuestionIndex);
                    }
                    else
                    {
                        intent.putExtra("score", Score);
                        intent.putExtra("questionNumber", currentQuestionIndex);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private void showQuestion(int questionIndex) {
        textView1.setText(questions[questionIndex]);

        String newText = "What was the number ?";
        textView1.setTextSize(20);

        // Remove any pending callbacks before scheduling a new one
        if (delayRunnable != null) {
            handler.removeCallbacks(delayRunnable);
        }

        delayRunnable = new Runnable() {
            @Override
            public void run() {
                textView1.setText(newText);
            }
        };

        handler.postDelayed(delayRunnable, 7000); // Delay in milliseconds (7 seconds = 7000 milliseconds)
    }
}