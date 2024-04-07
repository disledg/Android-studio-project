package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<item> carItems = new ArrayList<>();
// Заполните dataList данными для отображения в RecyclerView
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        //carItems.add(new item(R.drawable.image2, "Text4", "Text5", "Text6"));
        MyAdapter adapter = new MyAdapter(carItems,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        ImageView homeBtn = findViewById(R.id.homeBtn);
        ImageView contactsBtn = findViewById(R.id.contactsBtn);
        ImageView profileBtn = findViewById(R.id.profileBtn);
        contactsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CarsharingActivity.this, ContactActivivty.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
