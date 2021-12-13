package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listview extends AppCompatActivity {

    String nazioni[] = {"Italia", "Germania", "Olanda", "Stati Uniti"};

    ListView countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        countryList = findViewById(R.id.countryList);
        ArrayAdapter<String> countryArrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, nazioni);
        countryList.setAdapter(countryArrayAdapter);

        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Display_activity.class);
                startActivity(intent);
            }
        });
    }
}