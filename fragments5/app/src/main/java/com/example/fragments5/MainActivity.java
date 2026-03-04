package com.example.fragments5;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        // Adding 4 Attractive & Informative Fragments

        addFragment("🌍 About Android",
                "Android is an open-source operating system developed by Google.\n\n" +
                        "It powers billions of smartphones, tablets, TVs, and smart devices.\n\n" +
                        "Android apps are mainly developed using Java or Kotlin.");

        addFragment("📱 What is Fragment?",
                "A Fragment is a reusable part of an Activity UI.\n\n" +
                        "Fragments help create flexible and dynamic screen designs.\n\n" +
                        "They are widely used in modern Android apps.");

        addFragment("🚀 Advantages of Fragments",
                "1️⃣ Reusable UI components\n\n" +
                        "2️⃣ Better screen adaptability\n\n" +
                        "3️⃣ Supports multi-pane layouts\n\n" +
                        "4️⃣ Improves app structure and performance");

        addFragment("💡 Why Use Expandable UI?",
                "Expandable UI improves user experience by:\n\n" +
                        "✔ Saving screen space\n" +
                        "✔ Organizing information clearly\n" +
                        "✔ Making content interactive\n" +
                        "✔ Creating modern app design");
    }

    private void addFragment(String title, String content) {

        ExpandableFragment fragment = new ExpandableFragment(title, content);

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.container, fragment);
        transaction.commit();
    }
}