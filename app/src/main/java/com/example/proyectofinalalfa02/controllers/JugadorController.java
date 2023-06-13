package com.example.proyectofinalalfa02.controllers;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinalalfa02.JugadorListAdapter;
import com.example.proyectofinalalfa02.models.Jugador;
import com.example.proyectofinalalfa02.models.JugadorDao;

import java.util.List;

/**
 * Clase JugadorController
 */
public class JugadorController {

    private Context context;//declaracion de objeto Context

    /**
     * Constructor que recibe un objeto Context
     * @param context
     */
    public JugadorController(Context context) {
        this.context = context;
    }

    /**
     * Permite mostrar la lista de jugadores
     * @param recyclerView
     * @param adapter
     */
    public void mostrarJugadores(RecyclerView recyclerView , JugadorListAdapter adapter){

        //creacion de objeto jugadorDao para obtener la lista de jugadores
        JugadorDao jugadorDao =  new JugadorDao(this.context).obtenerJugadores(new JugadorDao.CallBack() {

            //Establece la lista de jugadores
            @Override
            public void onSuccess(List<Jugador> jugadores) {
                recyclerView.setAdapter(adapter);
                adapter.setJugadores(jugadores);
            }

            //mensaje de error
            @Override
            public void onFail(String msg) {
                //Toast.makeText(recyclerView.getContext(), msg.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}
