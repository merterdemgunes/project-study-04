package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ImageView btn = findViewById(R.id.imageFollowing);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlayActivity.this,FollowingActivity.class));
            }
        });

        ImageView btn1 = findViewById(R.id.imageSimilar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlayActivity.this,SimilarActivity.class));
            }
        });


        ImageView btn2 = findViewById(R.id.imageRemember);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlayActivity.this,RememberActivity.class));
            }
        });

        Button btn3 = findViewById(R.id.btnBack1);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlayActivity.this,MainActivity.class));
            }
        });
    }
}