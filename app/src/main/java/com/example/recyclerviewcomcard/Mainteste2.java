package com.example.recyclerviewcomcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Mainteste2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainteste2);

        items = new ArrayList<>();
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}
