package com.example.place;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView placeImage;
    TextView textview;
    Drawable placeDrawable;
    int indexOfPicture = -1 ;
    Random randomChoose = new Random();
    int [] mPicture = {
            R.drawable.bowling,
            R.drawable.cinema,
            R.drawable.coffeshop,
            R.drawable.park,
            R.drawable.pool,
            R.drawable.restaurant,
            R.drawable.stadium,
            R.drawable.trampoline,

    };

    int[] mString= {
            R.string.string1,
            R.string.string2,
            R.string.string3,
            R.string.string4,
            R.string.string5,
            R.string.string6,
            R.string.string7,
            R.string.string8
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placeImage = findViewById(R.id.exit);
        textview = findViewById(R.id.text_view);
    }
    public void goNext(View view){
        if(indexOfPicture == 7)
            indexOfPicture = -1 ;
        placeDrawable = ContextCompat.getDrawable(this,mPicture[++indexOfPicture]);
        placeImage.setImageDrawable(placeDrawable);
        textview.setText(mString[indexOfPicture]);

    }
    public void goBack(View view){

        if(indexOfPicture <= 0)
            indexOfPicture = 8;
        placeDrawable = ContextCompat.getDrawable(this,mPicture[--indexOfPicture]);
        placeImage.setImageDrawable(placeDrawable);
        textview.setText(mString[indexOfPicture]);
    }
    public void ran(View view){
        indexOfPicture = randomChoose.nextInt(8);
        placeDrawable = ContextCompat.getDrawable(this,mPicture[indexOfPicture]);
        placeImage.setImageDrawable(placeDrawable);
        textview.setText(mString[indexOfPicture]);
    }
}