package com.example.carsheringapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    private RecyclerViewClickListener mListener;
    List<item> items;
    public MyAdapter(List<item> items,Context context,RecyclerViewClickListener listener) {
        this.items = items;
        this.context = context;
        this.mListener = listener;
    }
    public void setClickListener(RecyclerViewClickListener listener) {
        this.mListener = listener;
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
        holder.priceText.setText(data.getItemPrice() + "₽");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.onClick(view, holder.getAdapterPosition());
                }
                mListener.onClick(view, holder.getAdapterPosition());
                final Intent intent = new Intent(view.getContext(), NewOrder.class);
                intent.putExtra("location", data.getItemLoc());
                intent.putExtra("name", data.getItemName());
                intent.putExtra("price", data.getItemPrice());
                intent.putExtra("number", data.getNumberCar());
                intent.putExtra("image", data.getImageResource());
                // Вызов метода showInputDialog() с правильными аргументами
                MyAlertDialog.DialogDismissListener dismissListener = new MyAlertDialog.DialogDismissListener() {
                    @Override
                    public void onDialogDismissed() {
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent);
                    }
                };
                MyAlertDialog.showInputDialog(view.getContext(), intent, dismissListener);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
