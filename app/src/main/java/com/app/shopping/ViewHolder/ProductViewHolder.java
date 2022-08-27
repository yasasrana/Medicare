package com.app.shopping.ViewHolder;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.shopping.Interface.ItemClickListner;
import com.app.shopping.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;
    public ProductViewHolder(View itemView)
    {
        super(itemView);


        imageView = (ImageView) itemView.findViewById(R.id.imageView6);
        txtProductName = (TextView) itemView.findViewById(R.id.prod_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.prod_qty);
        txtProductPrice = (TextView) itemView.findViewById(R.id.prod_price);
    }

    public void setItemClickListner(ItemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view)
    {
        listner.onClick(view, getAdapterPosition(), false);
    }
}

