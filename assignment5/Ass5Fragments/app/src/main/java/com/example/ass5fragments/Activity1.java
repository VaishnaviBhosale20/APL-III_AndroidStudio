package com.example.ass5fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button buttonAction = findViewById(R.id.buttonAction);
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example action: show a toast
                Toast.makeText(Activity1.this, "Button in Activity 1 clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
