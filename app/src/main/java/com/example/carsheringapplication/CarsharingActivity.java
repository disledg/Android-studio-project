package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CarsharingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String stringValue = intent.getStringExtra("name");
        setContentView(R.layout.carsharingactivity);
        TextView welcome1  = findViewById(R.id.Welcome);
        String endWelcome = "Welcome, " + stringValue;
        welcome1.setText(endWelcome);
    }
}
