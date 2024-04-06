package com.example.carsheringapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHelper db = new DataBaseHelper(this);

        db.addData("Admin", "nimda");

        EditText usernameInputText = findViewById(R.id.usernameInput);
        EditText passwordInputText = findViewById(R.id.passwordInput);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInputText.getText().toString();
                String password = passwordInputText.getText().toString();

                if (db.checkLogin(username, password)) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    // Redirect to another activity upon successful login
                    Intent intent = new Intent(MainActivity.this, CarsharingActivity.class);
                    intent.putExtra("name", username);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button regist = findViewById(R.id.registButton);
        regist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, signinActivivty.class);
                startActivity(intent);
            }
        });
    }
}