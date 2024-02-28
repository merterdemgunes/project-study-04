package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SimilarActivity extends AppCompatActivity {

    private int scoreNumber = 0;
    private int QuestionNumber = 6;
    int selectionNumber = 0;
    boolean isS0open = false;
    boolean isS1open = false;
    boolean isS2open = false;
    boolean isS3open = false;
    boolean isS4open = false;
    boolean isS5open = false;
    boolean isS6open = false;
    boolean isS7open = false;
    boolean isS8open = false;
    boolean isS9open = false;
    boolean isS10open = false;
    boolean isS11open = false;

    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;

    private TextView textScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similar);

        textScore = findViewById(R.id.textScore);


        Button btn4 = findViewById(R.id.btnBack7);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SimilarActivity.this,PlayActivity.class));
            }
        });

        imageView = findViewById(R.id.imageSimilar);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView.setImageResource(R.drawable.atfinn);
                    isS0open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS10open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView.setImageResource(R.drawable.atfinn);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView10.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                    }
                    else
                    {
                        imageView.setImageResource(R.drawable.atfinn);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS0open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView1 = findViewById(R.id.imageSimilar1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView1.setImageResource(R.drawable.atbuzkrali);
                    isS1open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS11open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView1.setImageResource(R.drawable.atbuzkrali);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView11.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView1.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                    }
                    else
                    {
                        imageView1.setImageResource(R.drawable.atbuzkrali);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS1open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView1.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView2 = findViewById(R.id.imageSimilar2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView2.setImageResource(R.drawable.atprenses);
                    isS2open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS5open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView2.setImageResource(R.drawable.atprenses);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView5.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView2.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                    }
                    else
                    {
                        imageView2.setImageResource(R.drawable.atprenses);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        isS2open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView2.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView3 = findViewById(R.id.imageSimilar3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView3.setImageResource(R.drawable.atmarceline);
                    isS3open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS7open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView3.setImageResource(R.drawable.atmarceline);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView7.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView3.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                    }
                    else
                    {
                        imageView3.setImageResource(R.drawable.atmarceline);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        isS3open = false;

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView3.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);
                        }
                    }
                }
            }
        });

        imageView4 = findViewById(R.id.imageSimilar4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView4.setImageResource(R.drawable.atpenguen);
                    isS4open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS6open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView4.setImageResource(R.drawable.atpenguen);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView6.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView4.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView4.setImageResource(R.drawable.atpenguen);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS4open = false;

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView4.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                         }
                    }
                }
            }
        });

        imageView5 = findViewById(R.id.imageSimilar5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView5.setImageResource(R.drawable.atprenses);
                    isS5open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS2open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView5.setImageResource(R.drawable.atprenses);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView2.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView5.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView5.setImageResource(R.drawable.atprenses);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS5open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView5.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);
                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView6 = findViewById(R.id.imageSimilar6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView6.setImageResource(R.drawable.atpenguen);
                    isS6open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS4open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView6.setImageResource(R.drawable.atpenguen);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView4.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView6.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView6.setImageResource(R.drawable.atpenguen);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS6open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView6.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);
                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView7 = findViewById(R.id.imageSimilar7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView7.setImageResource(R.drawable.atmarceline);
                    isS7open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS3open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView7.setImageResource(R.drawable.atmarceline);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView3.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView7.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView7.setImageResource(R.drawable.atmarceline);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS7open = false;

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView7.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView8 = findViewById(R.id.imageSimilar8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView8.setImageResource(R.drawable.atjake);
                    isS8open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS9open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView8.setImageResource(R.drawable.atjake);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView9.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView8.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView8.setImageResource(R.drawable.atjake);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS8open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView8.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);
                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView9 = findViewById(R.id.imageSimilar9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView9.setImageResource(R.drawable.atjake);
                    isS9open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS8open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView9.setImageResource(R.drawable.atjake);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView8.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView9.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView9.setImageResource(R.drawable.atjake);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS9open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView9.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);
                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView10 = findViewById(R.id.imageSimilar10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView10.setImageResource(R.drawable.atfinn);
                    isS10open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS0open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView10.setImageResource(R.drawable.atfinn);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView10.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView10.setImageResource(R.drawable.atfinn);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS10open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView10.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);

                        if (isS1open)
                        {
                            imageView1.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS1open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView1.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });

        imageView11 = findViewById(R.id.imageSimilar11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectionNumber++;
                // Perform the animation when the ImageView is clicked
                ObjectAnimator scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                scaleAnimator.start(); // Start the animation

                if (selectionNumber == 1)
                {
                    imageView11.setImageResource(R.drawable.atbuzkrali);
                    isS11open = true;
                }
                else if (selectionNumber == 2)
                {
                    selectionNumber = 0;

                    if (isS1open)
                    {
                        scoreNumber++;
                        textScore.setText(scoreNumber + "/" + (QuestionNumber));
                        if (scoreNumber == QuestionNumber)
                        {
                            Intent intent = new Intent(SimilarActivity.this,ResultActivity2.class);
                            intent.putExtra("scoreNumber", scoreNumber);
                            intent.putExtra("questionNumber", QuestionNumber);
                            startActivity(intent);
                        }

                        imageView11.setImageResource(R.drawable.atbuzkrali);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        scaleAnimator = ObjectAnimator.ofFloat(imageView1, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView1.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView11.setVisibility(View.INVISIBLE);
                            }
                        }, 1000);

                    }
                    else
                    {
                        imageView11.setImageResource(R.drawable.atbuzkrali);
                        scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                        scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                        scaleAnimator.start(); // Start the animation

                        isS11open = false;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageView11.setImageResource(R.drawable.atcardmain);
                            }
                        }, 1000);
                        if (isS0open)
                        {
                            imageView.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS0open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }

                        else if (isS2open)
                        {
                            imageView2.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView2, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS2open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView2.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS3open)
                        {
                            imageView3.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView3, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS3open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView3.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS4open)
                        {
                            imageView4.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView4, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS4open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView4.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS5open)
                        {
                            imageView5.setImageResource(R.drawable.atprenses);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS5open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView5.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS6open)
                        {
                            imageView6.setImageResource(R.drawable.atpenguen);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView6, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS6open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView6.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS7open)
                        {
                            imageView7.setImageResource(R.drawable.atmarceline);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView7, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS7open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView7.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS8open)
                        {
                            imageView8.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView8, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS8open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView8.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS9open)
                        {
                            imageView9.setImageResource(R.drawable.atjake);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView9, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS9open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView9.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS10open)
                        {
                            imageView10.setImageResource(R.drawable.atfinn);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView10, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS10open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView10.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                        else if (isS11open)
                        {
                            imageView11.setImageResource(R.drawable.atbuzkrali);
                            scaleAnimator = ObjectAnimator.ofFloat(imageView11, "scaleX", 1.0f, 1.2f, 1.0f);
                            scaleAnimator.setDuration(600); // Set the duration of the animation in milliseconds
                            scaleAnimator.start(); // Start the animation

                            isS11open = false;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    imageView11.setImageResource(R.drawable.atcardmain);
                                }
                            }, 1000);                        }
                    }
                }
            }
        });
        }
}