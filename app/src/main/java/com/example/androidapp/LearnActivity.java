package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        ImageView btn = findViewById(R.id.imageMonth);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearnActivity.this,MonthActivity.class));
            }
        });

        ImageView btn1 = findViewById(R.id.imageMath);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearnActivity.this,MathActivity.class));
            }
        });

        ImageView btn2 = findViewById(R.id.imageDirection);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearnActivity.this,DirectionActivity.class));
            }
        });

        Button btn3 = findViewById(R.id.btnBack);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LearnActivity.this,MainActivity.class));
            }
        });

    }
}