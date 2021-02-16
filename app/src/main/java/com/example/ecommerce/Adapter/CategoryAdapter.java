package com.example.ecommerce.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerce.Model.ItemModel;
import com.example.ecommerce.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    private List<ItemModel> list;

    public CategoryAdapter(Context context, List<ItemModel> list) {
        this.context = context;
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage=itemView.findViewById(R.id.product_category_id);
            itemName=itemView.findViewById(R.id.Name_category_id);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModel item = list.get(position);

        holder.itemImage.setImageResource(item.getImage());
        holder.itemName.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
