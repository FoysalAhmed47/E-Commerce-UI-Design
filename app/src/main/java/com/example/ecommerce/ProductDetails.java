package com.example.ecommerce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RatingBar;
import android.widget.Toast;

import com.thebluealliance.spectrum.SpectrumPalette;

public class ProductDetails extends AppCompatActivity {

    RatingBar ratingBar;
    SpectrumPalette palette;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_product_details);

        palette=findViewById(R.id.palette);
        palette.setOnColorSelectedListener(
                clr -> color=clr
        );
        palette.setSelectedColor(getResources().getColor(R.color.white));
        color=getResources().getColor(R.color.white);

        ratingBar=findViewById(R.id.rating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String message=null;
                switch (rating)
                {
                    case 1:
                        message="Thank You!";
                        break;
                    case 2:
                        message="Thank You!";
                        break;
                    case 3:
                        message="Thank You!";
                        break;
                    case 4:
                        message="Thank You!";
                        break;
                    case 5:
                        message="Thanks Dear You are great!";
                        break;
                }
                Toast.makeText(ProductDetails.this,message,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
