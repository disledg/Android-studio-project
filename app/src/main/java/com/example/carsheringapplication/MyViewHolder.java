package com.example.carsheringapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView carPhoto;
    TextView locationText,nameText,priceText;
    public MyViewHolder(View itemView) {
        super(itemView);
        carPhoto = itemView.findViewById(R.id.imageView);
        locationText = itemView.findViewById(R.id.location);
        nameText =itemView.findViewById(R.id.name);
        priceText = itemView.findViewById(R.id.price);

    }
}
