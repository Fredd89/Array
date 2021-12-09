package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Listview.class);
                startActivity(intent);
            }
        });
    }
}