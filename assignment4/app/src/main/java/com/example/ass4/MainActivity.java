package com.example.ass4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ass4.R;
public class MainActivity extends AppCompatActivity {

    Button btnImplicit, btnExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImplicit = findViewById(R.id.btnImplicit);
        btnExplicit = findViewById(R.id.btnExplicit);

        // IMPLICIT INTENT
        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
                implicitIntent.setData(Uri.parse("https://www.google.com"));
                startActivity(implicitIntent);
            }
        });

        // EXPLICIT INTENT
        btnExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent =
                        new Intent(MainActivity.this, SecondActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}