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

public class WatchActivity extends AppCompatActivity {
    List<ItemModel> PItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_watch);

        PItem = new ArrayList<>();
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));
        PItem.add(new ItemModel(R.drawable.watches, "Watch"));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.watch_recyclerview_id);
        ShowAllAdapter myAdapter = new ShowAllAdapter(this,PItem);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
