package com.example.proyectofinalalfa02.models;

import static com.example.proyectofinalalfa02.JugadorLogueado.jugadorID;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JugadorDao {
    //declaracion de atributos
    private List<Jugador> jugadores; //lista de tipo jugador
    private Context context; //creacion de objeto Context
    private RequestQueue mRequestQueue; //creacion de objeto Request

    //Constructor de la clase JugadorDao
    public JugadorDao(Context context) {
        this.context = context;
        jugadores = new ArrayList<>();
        mRequestQueue = Volley.newRequestQueue(this.context);
    }



    public JugadorDao AumentarPuntaje(){
        String url = "http://192.168.1.101:8080/aumentarpuntaje/" + jugadorID;
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, null,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Manejar el error de la solicitud
                    }
                });

        // Agregar la solicitud a la cola de Volley
        Volley.newRequestQueue(context).add(stringRequest);

        return null;
    }


    /**
     * recupera todas las asignaturas de la base de datos
     *
     * @param onCallBack
     * @return
     */
    public JugadorDao obtenerJugadores(final CallBack onCallBack) {
        //URL del endpoint
        String url = "http://192.168.1.101:8080/jugador";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Jugador jugador = new Jugador();
                try {
                    JSONArray jsonArray = new JSONArray(response);
                    // Recorremos el array JSON y almacenamos los datos en una lista
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);

                        //obtenemos los datos con base a las claves del JSON
                        int jug_id = jsonObject.getInt("jugid");
                        String jug_nombre = jsonObject.getString("jugNombre");
                        String jug_apellidopat = jsonObject.getString("jugApellidoPat");
                        String jug_apellidomat = jsonObject.getString("jugApellidoMat");
                        String jug_carrera = jsonObject.getString("jugCarrera");
                        int jug_puntaje = jsonObject.getInt("jugPuntaje");
                        String jug_password = jsonObject.getString("jugPassword");

                        //agregamos los datos a la lista
                        jugadores.add(new Jugador(jug_id, jug_nombre, jug_apellidopat, jug_apellidomat, jug_carrera, jug_puntaje, jug_password));

                    }//fin del for
                    onCallBack.onSuccess(jugadores);
                } catch (JSONException e) {
                    e.printStackTrace();
                    onCallBack.onFail(e.toString());
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        mRequestQueue.add(stringRequest);
        return null;
    }





    public interface CallBack {
        void onSuccess(List<Jugador> jugadores);

        void onFail(String msg);
    }
}
