package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;




public class FollowingActivity extends AppCompatActivity {
  private ShapeableImageView imageFollowing;
    private float initialX;

    boolean isStop = false;
    int speed = 3000;
    float startX;
    float endOfLineX;
    float endOfLineY;
    float nextLineY;
    ObjectAnimator xAnimator;

    boolean stopRequested = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);

        imageFollowing = findViewById(R.id.imageFollowing);
        initialX = imageFollowing.getX(); // Store the initial x-coordinate


        Button btn4 = findViewById(R.id.btnBack5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FollowingActivity.this,PlayActivity.class));
            }
        });

        MaterialButton button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (isStop == true)
                {
                    speed = 3000;
                    isStop = false;
                }
                moveImageOnXAxis();
            }
        });


        MaterialButton buttonPos = findViewById(R.id.buttonPositive);
        buttonPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isStop == true) {

                } else {
                    speed = 1000;
                    xAnimator.setDuration(speed); // Set the initial duration of the animation
                }
            }
        });

        MaterialButton buttonMin = findViewById(R.id.buttonMines);
        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (isStop == true) {

                } else {
                    speed = 5000;
                    xAnimator.setDuration(speed); // Set the initial duration of the animation
                }
            }
        });

        MaterialButton buttonStop = findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                speed = 10000000;
                xAnimator.setDuration(speed); // Set the initial duration of the animation
                imageFollowing.setY(imageFollowing.getY());
                isStop = true;
            }
        });
    }

    private void moveImageOnXAxis() {
        startX = initialX; // Starting x-coordinate of the image
        endOfLineX = initialX + 659; // X-coordinate at the end of the line
        endOfLineY = imageFollowing.getY(); // Y-coordinate of the current line
        nextLineY = endOfLineY + 90; // Y-coordinate of the next line

        xAnimator = ObjectAnimator.ofFloat(imageFollowing, "x", startX, endOfLineX);
        xAnimator.setDuration(speed); // Set the duration of each line movement in milliseconds
        xAnimator.setInterpolator(new LinearInterpolator());

        xAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                if (nextLineY >= 1260) {
                    imageFollowing.setY(-28); // Reset the Y-coordinate to its default value
                    imageFollowing.setX(18); // Reset the X-coordinate to its default value
                } else {
                    imageFollowing.setY(nextLineY); // Set the new Y-coordinate
                    moveImageOnXAxis(); // Repeat the animation
                }
            }
        });

        xAnimator.start();
    }



}

