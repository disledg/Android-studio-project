package com.example.carsheringapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    private RecyclerViewClickListener mListener;
    List<item> items;
    public MyAdapter(List<item> items,Context context) {
        this.items = items;
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view , parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
        item data = items.get(position);
        holder.carPhoto.setImageResource(data.getImageResource());
        holder.locationText.setText(data.getItemLoc());
        holder.nameText.setText(data.getItemName());
        holder.priceText.setText(data.getItemPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
