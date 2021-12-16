package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Display_activity extends AppCompatActivity {

    int poster;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        image = findViewById(R.id.imageView);

        Intent intent = getIntent();
        poster = intent.getIntExtra("image", 0);
        image.setImageResource(poster);

    }
}