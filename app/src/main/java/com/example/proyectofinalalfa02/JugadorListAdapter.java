package com.example.proyectofinalalfa02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinalalfa02.models.Jugador;

import java.util.List;

public class JugadorListAdapter extends RecyclerView.Adapter<JugadorListAdapter.JugadorViewHolder> {

    private final LayoutInflater mInflater;
    private List<Jugador> listaJugadores;
    private Context context;

    public JugadorListAdapter(Context context){
        this.context =  context;
        mInflater = LayoutInflater.from(context);
    }

    public void setJugadores(List<Jugador> jugadores){
        listaJugadores = jugadores;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public JugadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.usuariocard_recyclerviewitem, parent, false);
        return new JugadorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull JugadorViewHolder holder, int position) {
        //obtiene el elemento actual
        Jugador jugador = listaJugadores.get(position);

        //asigna el valor al textview
        holder.nombre.setText(jugador.getJug_nombre());
        holder.carrera.setText(jugador.getJug_carrera());
        holder.puntaje.setText("" + jugador.getJug_puntaje());
    }

    @Override
    public int getItemCount() {
        if (listaJugadores!=null){
            return listaJugadores.size();
        }else{
            return 0;
        }
    }

    class JugadorViewHolder extends RecyclerView.ViewHolder{

        private final TextView nombre;
        private final TextView carrera;
        private final TextView puntaje;

        public JugadorViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre =  itemView.findViewById(R.id.textView3);
            carrera = itemView.findViewById(R.id.textView4);
            puntaje =  itemView.findViewById(R.id.textView6);

        }
    }//fin de la clase interna
}
