package com.example.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.ecommerce.Adapter.CustomAdapter;
import com.example.ecommerce.Model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView collectionRecyclr, bestSellerRecyclr;
    List<ItemModel> itemModelList;
    Button showAllBtn,bestSellerBtn;
    TextView tShirt,jeans,mobile,watch,laptop,bag,shoe,sunglass,headphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_drawer);

        headphone=findViewById(R.id.headphone);
        headphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), HeadPhoneActivity.class);
                startActivity(intent);
            }
        });

        sunglass=findViewById(R.id.sunglass);
        sunglass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SunGlassActivity.class);
                startActivity(intent);
            }
        });

        shoe=findViewById(R.id.shoe);
        shoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShoeActivity.class);
                startActivity(intent);
            }
        });

        bag=findViewById(R.id.bag);
        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), BagActivity.class);
                startActivity(intent);
            }
        });


        laptop=findViewById(R.id.laptop);
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LaptopActivity.class);
                startActivity(intent);
            }
        });

        watch=findViewById(R.id.watch);
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), WatchActivity.class);
                startActivity(intent);
            }
        });


        mobile=findViewById(R.id.mobile);
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MobileActivity.class);
                startActivity(intent);
            }
        });

       jeans=findViewById(R.id.jeans);
       jeans.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getApplicationContext(), JeansActivity.class);
               startActivity(intent);
           }
       });


        tShirt=findViewById(R.id.t_shirt);
        tShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), tShirtActivity.class);
                startActivity(intent);
            }
        });

        bestSellerBtn=findViewById(R.id.bestSeller_More_btn);
        bestSellerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShowAllActivity.class);
                startActivity(intent);
            }
        });

        showAllBtn=findViewById(R.id.newCollection_more_btn);
        showAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShowAllActivity.class);
                startActivity(intent);
            }
        });


        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        collectionRecyclr = findViewById(R.id.newCollection_recyclr_view);
        bestSellerRecyclr = findViewById(R.id.bestSeller_recyclr_view);
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

        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        collectionRecyclr.setLayoutManager(manager1);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        bestSellerRecyclr.setLayoutManager(manager2);


        CustomAdapter adapter1 = new CustomAdapter(this, itemModelList);
        collectionRecyclr.setAdapter(adapter1);

        CustomAdapter adapter2 = new CustomAdapter(this, itemModelList);
        bestSellerRecyclr.setAdapter(adapter2);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawerLayout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_newCollection) {
            Intent i = new Intent(DrawerActivity.this, ShowAllActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_categories) {
            Intent i = new Intent(DrawerActivity.this, Categories.class);
            startActivity(i);

        } else if (id == R.id.nav_notification) {

        } else if (id == R.id.nav_setting) {

        } else if (id == R.id.nav_logout) {

        }


        DrawerLayout drawer = findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
