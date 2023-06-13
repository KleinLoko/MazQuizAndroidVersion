package com.example.proyectofinalalfa02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalalfa02.controllers.QuizController;

import java.util.Random;

public class QuestActivity extends AppCompatActivity {

    private int contRespuestaCorrecta = 0;

    QuizController quizController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        Intent intent = getIntent();

        int id = generarIdAleatorio();

        quizController = new QuizController(this, this);

        quizController.mostrarPregunta(id);

    }

    public int generarIdAleatorio() {
        int numRandom = 1;
        Random random = new Random();

        // Generar un número aleatorio del 1 al 4
        numRandom = random.nextInt(17) + 1;

        return numRandom;
    }

    public void comprobarCorrecta1(View view) {
        TextView resValue1 = findViewById(R.id.resValue1);
        String valorResValue1 = resValue1.getText().toString();

        int valorEnteroResValue1 = Integer.parseInt(valorResValue1);
        comprobarCorrecta(valorEnteroResValue1);
    }

    public void comprobarCorrecta2(View view) {
        TextView resValue2 = findViewById(R.id.resValue2);
        String valorResValue2 = resValue2.getText().toString();

        int valorEnteroResValue2 = Integer.parseInt(valorResValue2);
        comprobarCorrecta(valorEnteroResValue2);
    }

    public void comprobarCorrecta3(View view) {
        TextView resValue3 = findViewById(R.id.resValue3);
        String valorResValue3 = resValue3.getText().toString();

        int valorEnteroResValue3 = Integer.parseInt(valorResValue3);
        comprobarCorrecta(valorEnteroResValue3);
    }

    public void comprobarCorrecta4(View view) {
        TextView resValue4 = findViewById(R.id.resValue4);
        String valorResValue4 = resValue4.getText().toString();

        int valorEnteroResValue4 = Integer.parseInt(valorResValue4);
        comprobarCorrecta(valorEnteroResValue4);
    }

    public void comprobarCorrecta(int value) {

        if (value == 1) {
            Toast.makeText(this, "Es correcta", Toast.LENGTH_SHORT).show();
            quizController.mostrarPregunta(generarIdAleatorio());
            contRespuestaCorrecta = contRespuestaCorrecta + 1;

            if (contRespuestaCorrecta >= 3) {
                quizController.AumentarPuntaje();
                Toast.makeText(this, "Haz Pasado de piso", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }

        } else {
            Toast.makeText(this, "No es correcta", Toast.LENGTH_SHORT).show();
            onBackPressed();
        }


    }
}