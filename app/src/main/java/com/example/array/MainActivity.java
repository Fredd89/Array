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
        ArrayAdapter<String> countryArrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, nazioni);
        countryList.setAdapter(countryArrayAdapter);

    }
}