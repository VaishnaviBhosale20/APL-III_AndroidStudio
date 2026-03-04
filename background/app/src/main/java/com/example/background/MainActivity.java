package com.example.background;   // ⚠️ make sure this matches YOUR package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    Button btnRed, btnGreen, btnLotus, btnRiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnLotus = findViewById(R.id.btnLotus);
        btnRiver = findViewById(R.id.btnRiver);

        // Button 1 → Red
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            }
        });

        // Button 2 → Green
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

        // Button 3 → Lotus Image
        btnLotus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundResource(R.drawable.rose);
            }
        });

        // Button 4 → River Image
        btnRiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundResource(R.drawable.river);
            }
        });
    }
}