package com.example.proyectofinalalfa02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyectofinalalfa02.controllers.JugadorController;

public class StatsActivity extends AppCompatActivity {

    private JugadorController jugadorController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        jugadorController =  new JugadorController(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final JugadorListAdapter adapter = new JugadorListAdapter(this);
        recyclerView.setAdapter(adapter);
        jugadorController.mostrarJugadores(recyclerView, adapter);
    }
}