package com.example.array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listview extends AppCompatActivity {

    String film[] = {"The Phantom Menace", "Attack Of The Clones", "Revenge Of The Sith", "Spiderman No Way Home"};

    ListView filmList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        filmList = findViewById(R.id.filmList);
        ArrayAdapter<String> countryArrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, film);
        filmList.setAdapter(countryArrayAdapter);

        filmList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Listview.this, Display_activity.class);
                startActivity(intent);
            }
        });
    }
}