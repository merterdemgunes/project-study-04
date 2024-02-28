package com.example.androidapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword,
                editTextConfPassword;
    Button buttonReg;
    FirebaseAuth mAuth;

    ProgressBar progressBar;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        boolean retrievedBoolean = getIntent().getBooleanExtra("isLogOut", false);

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (!retrievedBoolean)
        {
            if(currentUser != null){
                startActivity(new Intent(RegisterActivity.this,MainActivity.class));
            }
        }
        else
        {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.inputEmail);
        editTextPassword = findViewById(R.id.inputPassword);
        editTextConfPassword = findViewById(R.id.inputConfirmationPassword);
        buttonReg = findViewById(R.id.btnRegister);
        progressBar = findViewById(R.id.progressBar);

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);

                String email,password,confPassword;

                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                confPassword = String.valueOf(editTextConfPassword.getText());

                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(RegisterActivity.this,"Enter Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(RegisterActivity.this,"Enter Password",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(confPassword))
                {
                    Toast.makeText(RegisterActivity.this,"Enter Confirmation Password",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confPassword))
                {
                    Toast.makeText(RegisterActivity.this,"Check Your Password Again.",Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    progressBar.setVisibility(View.GONE);
                                    Toast.makeText(RegisterActivity.this, "Account Created.",
                                            Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                                } else {
                                    // If sign in fails, display a message to the user.
                                    progressBar.setVisibility(View.GONE);
                                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        TextView btn1 = findViewById(R.id.alreadyHaveAccount);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

    }
}