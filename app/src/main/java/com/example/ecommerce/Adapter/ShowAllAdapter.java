package com.example.ecommerce.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerce.Model.ItemModel;
import com.example.ecommerce.ProductDetails;
import com.example.ecommerce.R;

import java.util.List;

public class ShowAllAdapter extends RecyclerView.Adapter<ShowAllAdapter.ViewHolder> {
    private Context mContext ;
    private List<ItemModel> item ;

    public ShowAllAdapter(Context mContext, List<ItemModel> item) {
        this.mContext = mContext;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_showall, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemImage.setImageResource(item.get(position).getImage());
        holder.itemName.setText(item.get(position).getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(mContext, ProductDetails.class);
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName;
        CardView cardView ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage=itemView.findViewById(R.id.item_Image);
            itemName=itemView.findViewById(R.id.item_Name);
            cardView =itemView.findViewById(R.id.Product_card_id);
        }
    }
}
