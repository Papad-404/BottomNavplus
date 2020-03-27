package com.example.bottomnavigation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class IhramActivity extends AppCompatActivity {
    TextView mtext;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ihram);

        ActionBar actionBar = getSupportActionBar();

        mtext = findViewById(R.id.text_penjelas);
        imageView = findViewById(R.id.image_penjelas);
    }
}
