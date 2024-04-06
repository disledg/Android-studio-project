package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class signinActivivty extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        EditText loginNInput = findViewById(R.id.editTextLogin);
        EditText passwordInput = findViewById(R.id.editTextPassword);
        EditText phoneInput = findViewById(R.id.editTextPhone);
        EditText emailInput = findViewById(R.id.editTextEmailAddress);
        Button fileInput = findViewById(R.id.fileInputButton);

        fileInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
                Toast.makeText(getApplicationContext(), "Кнопка была нажата", Toast.LENGTH_SHORT).show();
            }
        });
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
