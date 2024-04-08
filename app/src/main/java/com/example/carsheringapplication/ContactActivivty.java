package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivivty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_activivty);
    }

    public void onImageButtonClick1(View view) {
        Intent intent = new Intent(ContactActivivty.this, CarsharingActivity.class);
        startActivity(intent);
        finish();
    }
}
