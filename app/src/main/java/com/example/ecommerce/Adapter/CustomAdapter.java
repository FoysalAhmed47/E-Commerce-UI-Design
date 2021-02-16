package com.example.ecommerce.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerce.Model.ItemModel;
import com.example.ecommerce.ProductDetails;
import com.example.ecommerce.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private List<ItemModel> list;

    public CustomAdapter(Context context, List<ItemModel> list) {
        this.context = context;
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName;
        CardView cardView ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage=itemView.findViewById(R.id.item_Image);
            itemName=itemView.findViewById(R.id.item_Name);
            cardView=itemView.findViewById(R.id.Product_card_id);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ItemModel item = list.get(position);

        holder.itemImage.setImageResource(item.getImage());
        holder.itemName.setText(item.getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context, ProductDetails.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
