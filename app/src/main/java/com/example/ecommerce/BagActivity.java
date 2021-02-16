package com.example.ecommerce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.example.ecommerce.Adapter.ShowAllAdapter;
import com.example.ecommerce.Model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class BagActivity extends AppCompatActivity {
    List<ItemModel> PItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bag);

        PItem = new ArrayList<>();
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));

        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));

        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));

        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));

        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));

        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));
        PItem.add(new ItemModel(R.drawable.purses_bags, "Bag"));





        RecyclerView myrv = (RecyclerView) findViewById(R.id.bag_recyclerview_id);
        ShowAllAdapter myAdapter = new ShowAllAdapter(this,PItem);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
