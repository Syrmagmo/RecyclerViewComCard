package com.example.recyclerviewcomcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
/*
    private RecyclerView recyclerView; // Metodo FEED
    private CustomAdapter adapter; // Renomeado para evitar conflito de nomes
    private ArrayList<String> items;// Metodo FEED <MANUAL>
*/
    private Button meuBotao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        items = new ArrayList<>();// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>
        items.add("First cardView Item");// Metodo FEED <MANUAL>

        recyclerView = findViewById(R.id.recyclerView);// Metodo FEED
        recyclerView.setLayoutManager(new LinearLayoutManager(this));// Metodo FEED
        adapter = new CustomAdapter(this, items); // Renomeado para evitar conflito de nomes
        recyclerView.setAdapter(adapter);// Metodo FEED*/

        Button meuBotao = findViewById(R.id.button_Envia_outra);
        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar o Intent para iniciar a próxima Activity
                Intent intent = new Intent(MainActivity.this, Mainteste2.class);

                // Iniciar a próxima Activity
                startActivity(intent);
            }
        });

    }
}
