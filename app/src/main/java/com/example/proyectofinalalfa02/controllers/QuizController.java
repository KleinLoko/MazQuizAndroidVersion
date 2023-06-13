package com.example.proyectofinalalfa02.controllers;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyectofinalalfa02.QuestActivity;
import com.example.proyectofinalalfa02.R;
import com.example.proyectofinalalfa02.models.JugadorDao;
import com.example.proyectofinalalfa02.models.Quiz;
import com.example.proyectofinalalfa02.models.QuizCompleto;
import com.example.proyectofinalalfa02.models.QuizDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase QuizController
 */
public class QuizController {
    //declaracion de variables
    private Context context; //creacion de objeto Context
    private QuestActivity view;//creacion de view QuestActivity

    private TextView preguntaT;//creacion de TextView pregunta1
    private Button respuesta1;//creacion de boton respuesta1
    private TextView respuestaValue1;//creacion de Textview respuestaValue1
    private Button respuesta2;//creacion de boton respuesta2
    private TextView respuestaValue2;//creacion de Textview respuestaValue2
    private Button respuesta3;//creacion de boton respuesta3
    private TextView respuestaValue3;//creacion de TextView respuestaValue3
    private Button respuesta4;//creacion de boton respuesta4
    private TextView respuestaValue4;//creacion de Textview respuestaValue4

    /**
     * Constructor de la clase con dos parametros
     * @param context
     * @param view
     */
    public QuizController(Context context, QuestActivity view) {

        this.context = context;
        this.view = view;
        preguntaT = (TextView) view.findViewById(R.id.preguntaTW);
        respuesta1 = (Button) view.findViewById(R.id.button4);
        respuesta2 = (Button) view.findViewById(R.id.button3);
        respuesta3 = (Button) view.findViewById(R.id.button6);
        respuesta4 = (Button) view.findViewById(R.id.button2);
        respuestaValue1 = (TextView) view.findViewById(R.id.resValue1);
        respuestaValue2 = (TextView) view.findViewById(R.id.resValue2);
        respuestaValue3 = (TextView) view.findViewById(R.id.resValue3);
        respuestaValue4 = (TextView) view.findViewById(R.id.resValue4);

    }

    /**
     * Metodo que permite mostrar la pregunta correspondiente
     * @param id
     */
    public void mostrarPregunta(int id) {
        //declaracion de variables
        QuizDao.pregID = id;//id de la pregunta

        //creacion de QuizDao
        QuizDao quizDao = new QuizDao(this.context).ObtenerPregunta(new QuizDao.CallBack() {

            //Genera la pregunta y sus opciones de respuesta correspondientes
            @Override
            public void onSuccess(List<Quiz> pregunta) {

                //Genera el Quiz completo con las respuestas
                QuizCompleto quizCompleto = formarQuiz(pregunta);

                //alamcena en variables los valores de los elementos del quiz
                String preguntaTtext = quizCompleto.getPregunta();
                String respuesta1text = quizCompleto.getRespuesta1();
                String respuesta2text = quizCompleto.getRespuesta2();
                String respuesta3text = quizCompleto.getRespuesta3();
                String respuesta4text = quizCompleto.getRespuesta4();
                String respuestaValue1text = String.valueOf(quizCompleto.getRespuestaValue1());
                String respuestaValue2text = String.valueOf(quizCompleto.getRespuestaValue2());
                String respuestaValue3text = String.valueOf(quizCompleto.getRespuestaValue3());
                String respuestaValue4text = String.valueOf(quizCompleto.getRespuestaValue4());

                //Establece los valores de los elementos que corresponden
                preguntaT.setText(preguntaTtext);
                respuesta1.setText(respuesta1text);
                respuesta2.setText(respuesta2text);
                respuesta3.setText(respuesta3text);
                respuesta4.setText(respuesta4text);
                respuestaValue1.setText(respuestaValue1text);
                respuestaValue2.setText(respuestaValue2text);
                respuestaValue3.setText(respuestaValue3text);
                respuestaValue4.setText(respuestaValue4text);
            }

            //genera mensaje de error
            @Override
            public void onFail(String msg) {
            }
        });
    }

    /**
     * Permite formar el Quiz completo con la pregunta y las repsuestas que le correspoden  y retornalo
     * @param quizList
     * @return
     */
    public QuizCompleto formarQuiz(List<Quiz> quizList) {
        //declaracion de objeto QuizCompleto
        QuizCompleto miQuiz = new QuizCompleto();
        ArrayList<Quiz> quizArrayList = new ArrayList<>(quizList);

        //establece los valores del Quiz completo
        miQuiz.setPreguntaID(quizList.get(0).getIdQuiz());
        miQuiz.setPregunta(quizList.get(0).getPregunta());
        miQuiz.setRespuesta1(quizList.get(0).getRespuesta());
        miQuiz.setRespuestaValue1(quizList.get(0).getCorrecta());

        miQuiz.setRespuesta2(quizList.get(1).getRespuesta());
        miQuiz.setRespuestaValue2(quizList.get(1).getCorrecta());

        miQuiz.setRespuesta3(quizList.get(2).getRespuesta());
        miQuiz.setRespuestaValue3(quizList.get(2).getCorrecta());

        miQuiz.setRespuesta4(quizList.get(3).getRespuesta());
        miQuiz.setRespuestaValue4(quizList.get(3).getCorrecta());

        return miQuiz;
    }

    /**
     * Permite aumentar el puntaje del jugador
     */
    public void AumentarPuntaje(){
        JugadorDao jugadorDao = new JugadorDao(this.context).AumentarPuntaje();
    }

}
