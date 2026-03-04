package com.example.campuscare;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etFullName, etEmail, etPassword;
    RadioGroup radioGroupGender;
    CheckBox cbTerms;
    ToggleButton toggleNotifications;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        cbTerms = findViewById(R.id.cbTerms);
        toggleNotifications = findViewById(R.id.toggleNotifications);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndRegister();
            }
        });

        toggleNotifications.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(RegisterActivity.this,
                        "Notifications Enabled",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(RegisterActivity.this,
                        "Notifications Disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void validateAndRegister() {

        String fullName = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Full Name Validation
        if (TextUtils.isEmpty(fullName)) {
            etFullName.setError("Full name is required");
            etFullName.requestFocus();
            return;
        }

        // Email Validation
        if (TextUtils.isEmpty(email)) {
            etEmail.setError("Email is required");
            etEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Enter valid email");
            etEmail.requestFocus();
            return;
        }

        // Password Validation
        if (TextUtils.isEmpty(password)) {
            etPassword.setError("Password is required");
            etPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            etPassword.setError("Password must be at least 6 characters");
            etPassword.requestFocus();
            return;
        }

        // Gender Validation
        if (radioGroupGender.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this,
                    "Please select gender",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        // Terms Validation
        if (!cbTerms.isChecked()) {
            Toast.makeText(this,
                    "Please accept Terms &amp Conditions",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        // If all validations pass
        Toast.makeText(this,
                "Registration Successful!",
                Toast.LENGTH_LONG).show();
    }
}