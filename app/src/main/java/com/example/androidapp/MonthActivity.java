package com.example.androidapp;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MonthActivity extends AppCompatActivity {

    private ImageView monthImageView;
    private TextView monthTextView;
    private Button nextButton;

    private String[] months;

    private int[] monthImages =
            {
                    R.drawable.atjanuary, R.drawable.atfebruary, R.drawable.atmarch,
                    R.drawable.atapril, R.drawable.atmay, R.drawable.atjune,
                    R.drawable.atjuly, R.drawable.ataugst, R.drawable.atseptember,
                    R.drawable.atoctober, R.drawable.atnovember, R.drawable.atchristmas
            };

    private int currentMonthIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        months = new String[] {
                getString(R.string.January),
                getString(R.string.February),
                getString(R.string.March),
                getString(R.string.April),
                getString(R.string.May),
                getString(R.string.June),
                getString(R.string.July),
                getString(R.string.August),
                getString(R.string.September),
                getString(R.string.October),
                getString(R.string.November),
                getString(R.string.December)
        };

        Button btn3 = findViewById(R.id.btnBack3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MonthActivity.this,LearnActivity.class));
            }
        });


        monthImageView = findViewById(R.id.monthImageView);
        monthTextView = findViewById(R.id.monthTextView);
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
        monthTextView.setText(months[currentMonthIndex]);
        monthImageView.setImageResource(monthImages[currentMonthIndex]);
        currentMonthIndex = (currentMonthIndex + 1) % months.length;
    }
}
