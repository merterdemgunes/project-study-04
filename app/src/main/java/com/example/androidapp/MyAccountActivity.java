package com.example.androidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MyAccountActivity extends AppCompatActivity {
    private TextInputEditText inputUpdatePassword;
    private TextInputEditText inputUpdatePassword1;

    TextView emailTextView;

    private MaterialButton btnSumbit;

    private MaterialButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        inputUpdatePassword = findViewById(R.id.inputUpdatePassword);
        inputUpdatePassword1 = findViewById(R.id.inputUpdatePassword1);
        emailTextView = findViewById(R.id.emailTextview);
        btnSumbit = findViewById(R.id.btnSumbit1);
        btnBack = findViewById(R.id.btnBack10);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        emailTextView.setText(user.getEmail());

        //scoreTextView1.setText(user.);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MyAccountActivity.this,MainActivity.class));
            }
        });

        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldPassword = inputUpdatePassword.getText().toString().trim();
                String newPassword = inputUpdatePassword1.getText().toString().trim();

                if (oldPassword.isEmpty() || newPassword.isEmpty()) {
                    Toast.makeText(MyAccountActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (user != null) {
                    AuthCredential credential = EmailAuthProvider.getCredential(user.getEmail(), oldPassword);

                    user.reauthenticate(credential).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                user.updatePassword(newPassword).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> updateTask) {
                                        if (updateTask.isSuccessful()) {
                                            Toast.makeText(MyAccountActivity.this, "Password updated successfully", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Exception exception = updateTask.getException();
                                            Toast.makeText(MyAccountActivity.this, "Failed to update password: " + exception.getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            } else {
                                Toast.makeText(MyAccountActivity.this, "Authentication failed. Please check your old password.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}