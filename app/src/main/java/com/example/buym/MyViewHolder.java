package com.example.buym;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameview,priceview;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView =  itemView.findViewById(R.id.imageview);
        nameview =  itemView.findViewById(R.id.name);
        priceview =  itemView.findViewById(R.id.price);
    }
}
