package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarsharingActivity extends AppCompatActivity implements RecyclerViewClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carsharingactivity);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<item> carItems = new ArrayList<>();
// Заполните dataList данными для отображения в RecyclerView
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.kiario, "Kia Rio", "1800 руб.", "Симферополь"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", "2400 руб.", "Саратов"));
        carItems.add(new item(R.drawable.kiario, "Kia Rio", "1800 руб.", "Симферополь"));
        carItems.add(new item(R.drawable.skodaoctavia, "Skoda Octavia", "1690 руб.", "Ялта"));
        carItems.add(new item(R.drawable.nissanqashqai, "Nissan Qashqai", "2000 руб.", "Ялта"));
        carItems.add(new item(R.drawable.nissanqashqai, "Nissan Qashqai", "2000 руб.", "Ялта"));
        carItems.add(new item(R.drawable.skoda_rapid, "Skoda Rapid", "1950 руб.", "Симферополь"));
        carItems.add(new item(R.drawable.skodaoctavia, "Skoda Octavia", "1690 руб.", "Ялта"));
        //carItems.add(new item(R.drawable.image2, "Text4", "Text5", "Text6"));
        MyAdapter adapter = new MyAdapter(carItems,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        ImageView homeBtn = findViewById(R.id.imageButton2);
        ImageButton contactsBtn = findViewById(R.id.imageButton);
        ImageView profileBtn = findViewById(R.id.profileBtn);
        contactsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CarsharingActivity.this, ContactActivivty.class);
                startActivity(intent);
                finish();
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return;
            }
        });

    }

    @Override
    public void onClick(View view, int position) {

    }
}
