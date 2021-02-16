package com.example.ecommerce;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;

import com.example.ecommerce.Adapter.CategoryAdapter;
import com.example.ecommerce.Adapter.CustomAdapter;
import com.example.ecommerce.Model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class Categories extends AppCompatActivity {
    RecyclerView categoryRecyclr;
    List<ItemModel> itemModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_categories);
        categoryRecyclr = findViewById(R.id.category_recyclr_view);
        itemModelList = new ArrayList<>();

        itemModelList.add(new ItemModel(R.drawable.tshirts, "T-Shirt"));
        itemModelList.add(new ItemModel(R.drawable.sweather, "Sweater"));
        itemModelList.add(new ItemModel(R.drawable.shoess, "Shoe"));
        itemModelList.add(new ItemModel(R.drawable.glasses, "SunGlass"));
        itemModelList.add(new ItemModel(R.drawable.hats, "Hat"));
        itemModelList.add(new ItemModel(R.drawable.sports, "Jersey"));
        itemModelList.add(new ItemModel(R.drawable.watches, "Watch"));
        itemModelList.add(new ItemModel(R.drawable.mobiles, "Mobile"));
        itemModelList.add(new ItemModel(R.drawable.headphoness, "HeadPhone"));
        itemModelList.add(new ItemModel(R.drawable.laptops, "Laptop"));
        itemModelList.add(new ItemModel(R.drawable.purses_bags, "Bag"));


        LinearLayoutManager manager3 = new LinearLayoutManager(this);
        manager3.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclr.setLayoutManager(manager3);


        CategoryAdapter adapter3 = new CategoryAdapter(this, itemModelList);
        categoryRecyclr.setAdapter(adapter3);


    }
}