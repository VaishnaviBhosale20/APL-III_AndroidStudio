package com.example.ass9;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button btnAlert, btnPopup;

    String[] courses = {"Select Course", "Android", "Java", "Python", "Web Dev"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        btnAlert = findViewById(R.id.btnAlert);
        btnPopup = findViewById(R.id.btnPopup);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                courses
        );
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                showCustomToast("Selected: " + courses[position]);
            }

            @Override
            public void onNothingSelected(android.widget.AdapterView<?> parent) { }
        });

        btnAlert.setOnClickListener(v -> showAlert());

        btnPopup.setOnClickListener(this::showPopup);
    }

    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmation")
                .setMessage("Do you want to continue?")
                .setPositiveButton("Yes", (d, w) -> showCustomToast("You pressed YES"))
                .setNegativeButton("No", (d, w) -> showCustomToast("You pressed NO"))
                .show();
    }

    private void showPopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

        popup.setOnMenuItemClickListener(item -> {
            showCustomToast("Clicked: " + item.getTitle());
            return true;
        });

        popup.show();
    }

    private void showCustomToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}