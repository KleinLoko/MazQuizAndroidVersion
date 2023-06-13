package com.example.proyectofinalalfa02.models;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
public class QuizDao {
    private Quiz quiz =  null;
    private List<Quiz> pregunta;
    private Context context;
    private RequestQueue requestQueue;
    public static int pregID;

    public QuizDao(Context context){
        this.context =  context;
        pregunta =  new ArrayList<>();
        requestQueue = Volley.newRequestQueue(this.context);
    }

    public  QuizDao ObtenerPregunta(final CallBack onCallBack){

        String url = "http://192.168.1.101:8080/quizpregunta/" + pregID;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Quiz quiz = new Quiz();
                try {
                    JSONArray jsonArray = new JSONArray(response);

                    // Imprimir el JSON en el Logcat
                    Log.d("JSON Response", response);

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONArray itemArray = jsonArray.getJSONArray(i);

                        int variable1 = itemArray.getInt(0);
                        int variable2 = itemArray.getInt(1);
                        String variable3 = itemArray.getString(2);
                        int variable4 = itemArray.getInt(3);
                        String variable5 = itemArray.getString(4);
                        int variable6 = itemArray.getInt(5);

                        pregunta.add(new Quiz( variable1, variable2, variable3,variable4, variable5, variable6));

                        // Hacer algo con las variables
                        System.out.println(variable1 + " " + variable2 + " " + variable3 + " " + variable4 + " " + variable5 + " " + variable6);
                    }

                    onCallBack.onSuccess(pregunta);

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
        requestQueue.add(stringRequest);
        return null;
    }

    public interface CallBack {
        void onSuccess(List<Quiz> pregunta);
        void onFail(String msg);
    }

}
