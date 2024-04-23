package com.example.carsheringapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class NewOrder extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidThreeTen.init(this);
        setContentView(R.layout.new_order);
        Intent intent = getIntent();
        TextView priceTextView = findViewById(R.id.priceTextView);
        TextView carTextView = findViewById(R.id.carTextView);
        TextView numberTextView = findViewById(R.id.numberTextView);
        TextView locationTextView = findViewById(R.id.locationTextView);
        TextView dateTextView = findViewById(R.id.dateTextView);
        TextView timeTextView = findViewById(R.id.timeTextView);
        TextView arendTimeTV = findViewById(R.id.arendTimeTextView);
        TextView priceTV = findViewById(R.id.price1TextView);
        Ticket newOrder = new Ticket(intent.getStringExtra("name"),intent.getIntExtra("price",2),intent.getStringExtra("location"),intent.getStringExtra("number"),intent.getIntExtra("image",0),intent.getIntExtra("time",2));
        priceTextView.setText(String.valueOf(newOrder.getPrice()) + " ₽");
        carTextView.setText(newOrder.getCarName());
        numberTextView.setText(newOrder.getNumberCar());
        locationTextView.setText(newOrder.getPickUpLocation());
        dateTextView.setText(newOrder.getDate().toString().replace("-", "."));
        timeTextView.setText(newOrder.getTime().toString());
        int price = newOrder.getPrice();
        price = price * newOrder.getPickUpTime();
        if(newOrder.getPickUpTime() < 2){arendTimeTV.setText(String.valueOf(newOrder.getPickUpTime()) + " день");}
        else if (newOrder.getPickUpTime() >1 && newOrder.getPickUpTime() <5) {
            arendTimeTV.setText(String.valueOf(newOrder.getPickUpTime()) + " дня");
        } else{arendTimeTV.setText(String.valueOf(newOrder.getPickUpTime()) + " дней");}
        priceTV.setText(String.valueOf(price) + " ₽");
        //"₽"
    }
}
