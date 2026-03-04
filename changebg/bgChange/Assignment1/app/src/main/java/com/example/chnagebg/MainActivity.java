package com.example.chnagebg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnRed, btnGreen, btnRose, btnRiver;
    RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnRose = findViewById(R.id.btnRose);
        btnRiver = findViewById(R.id.btnRiver);

        mainLayout = findViewById(R.id.mainLayout);

        // Button 1 → Red Background
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

        // Button 2 → Green Background
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });

        // Button 3 → Rose Image Background
        btnRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundResource(R.drawable.rose);
            }
        });

        // Button 4 → River Image Background
        btnRiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundResource(R.drawable.river);
            }
        });
    }
}
