package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DirectionActivity extends AppCompatActivity {

    private ImageView directionImageView;
    private TextView directionTextView;
    private Button nextButton;

    private String[] direction;

    private int[] directionImages =
            {
                    R.drawable.atfront, R.drawable.atback, R.drawable.atleft,
                    R.drawable.atright
            };

    private int currentDirectionIndex = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        direction = new String[] {
                getString(R.string.Front),
                getString(R.string.Back),
                getString(R.string.Left),
                getString(R.string.Right)
        };

        Button btn3 = findViewById(R.id.btnBack4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DirectionActivity.this,LearnActivity.class));
            }
        });

        directionImageView = findViewById(R.id.directionImageView);
        directionTextView = findViewById(R.id.directionTextView);
        nextButton = findViewById(R.id.nextButton);

        updateMonth();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateMonth();
            }
        });
    }

    private void updateMonth() {
        directionTextView.setText(direction[currentDirectionIndex]);
        directionImageView.setImageResource(directionImages[currentDirectionIndex]);
        currentDirectionIndex = (currentDirectionIndex + 1) % direction.length;
    }
}