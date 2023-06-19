package com.example.recyclerviewcomcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter adapter; // Renomeado para evitar conflito de nomes
    private ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");
        items.add("First cardView Item");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(this, items); // Renomeado para evitar conflito de nomes
        recyclerView.setAdapter(adapter);
    }
}
