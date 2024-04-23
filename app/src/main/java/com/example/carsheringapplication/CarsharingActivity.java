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
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", 2400, "Саратов","Е397КЕ"));
        carItems.add(new item(R.drawable.kiario, "Kia Rio", 1800, "Симферополь","Т090КР"));
        carItems.add(new item(R.drawable.volkswagen_polo, "Volkswagen Polo", 2400, "Саратов","У657РМ"));
        carItems.add(new item(R.drawable.kiario, "Kia Rio", 1800, "Симферополь","А157АК"));
        carItems.add(new item(R.drawable.skodaoctavia, "Skoda Octavia", 1690, "Ялта","Е130ВК"));
        carItems.add(new item(R.drawable.nissanqashqai, "Nissan Qashqai", 2000, "Ялта","Р067НА"));
        carItems.add(new item(R.drawable.nissanqashqai, "Nissan Qashqai", 2000, "Ялта","Р111ТР"));
        carItems.add(new item(R.drawable.skoda_rapid, "Skoda Rapid", 1950, "Симферополь","О663НА"));
        carItems.add(new item(R.drawable.skodaoctavia, "Skoda Octavia", 1690, "Ялта","В933УМ"));
        //carItems.add(new item(R.drawable.image2, "Text4", "Text5", "Text6"));
        MyAdapter adapter = new MyAdapter(carItems,getApplicationContext(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        ImageView homeBtn = findViewById(R.id.imageButton2);
        ImageView profileBtn = findViewById(R.id.profileBtn);
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
