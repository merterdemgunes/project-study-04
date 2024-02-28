package com.example.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                // Handle menu item clicks here
                int itemId = item.getItemId();
                if (itemId == R.id.Settings) {
                    startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                    return true;
                } else if (itemId == R.id.MyAccount) {
                    startActivity(new Intent(MainActivity.this, MyAccountActivity.class));
                    return true;
                }else if (itemId == R.id.LogOut) {
                    boolean isLogOut = true;

                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    intent.putExtra("isLogOut", isLogOut);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });

        Button btn = findViewById(R.id.btnLearn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LearnActivity.class));
            }
        });


        Button btn1 = findViewById(R.id.btnPlay);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PlayActivity.class));
            }
        });

    }
}