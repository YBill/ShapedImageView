package com.example.bill.shapedimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageVie2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.siv_gif);
        imageVie2 = findViewById(R.id.siv_gif_2);

        Glide.with(this).load(R.drawable.gif1).into(imageView);
        Glide.with(this).load(R.drawable.gif1).into(imageVie2);


    }
}
