package com.example.campuscare;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class LoginActivity extends AppCompatActivity {

    EditText etLoginEmail, etLoginPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLogin();
            }
        });
    }

    private void validateLogin() {

        String email = etLoginEmail.getText().toString().trim();
        String password = etLoginPassword.getText().toString().trim();

        // Email validation
        if (TextUtils.isEmpty(email)) {
            etLoginEmail.setError("Email required");
            etLoginEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etLoginEmail.setError("Enter valid email");
            etLoginEmail.requestFocus();
            return;
        }

        // Password validation
        if (TextUtils.isEmpty(password)) {
            etLoginPassword.setError("Password required");
            etLoginPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            etLoginPassword.setError("Password must be at least 6 characters");
            etLoginPassword.requestFocus();
            return;
        }

//        Toast.makeText(this, "Login Successful!", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
        intent.putExtra("userEmail", email);
        startActivity(intent);
        finish(); // prevents back to login
    }
}