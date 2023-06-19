package com.example.recyclerviewcomcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;

    CustomAdapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = layoutInflater.inflate(R.layout.custom_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {

        // bind the textview with data received
        String title = data.get(position);
        ViewHolder.textTituloLivro.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        static TextView textTituloLivro;
        TextView TextAutor;
        TextView textAno;
        TextView TextGenero;
        TextView textValor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTituloLivro = itemView.findViewById(R.id.textTituloLivro);
            TextAutor = itemView.findViewById(R.id.TextAutor);
            textAno = itemView.findViewById(R.id.textAno);
            TextGenero = itemView.findViewById(R.id.TextGenero);
            textValor = itemView.findViewById(R.id.textValor);
        }
    }
}
