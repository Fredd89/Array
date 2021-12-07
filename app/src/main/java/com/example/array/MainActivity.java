package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String nazioni[] = {"Italia", "Germania", "Olanda", "Stati Uniti"};
    ListView countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryList = (ListView) findViewById(R.id.countryList);
        ArrayAdapter<String> countryAarrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, nazioni);
        countryList.setAdapter(countryAarrayAdapter);

    }
}