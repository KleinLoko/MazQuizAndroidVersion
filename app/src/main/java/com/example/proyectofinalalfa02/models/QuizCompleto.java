package com.example.proyectofinalalfa02.models;

import android.widget.Button;
import android.widget.TextView;

public class QuizCompleto {

    private int preguntaID;
    private String pregunta;
    private String respuesta1;
    private int respuestaValue1;
    private String respuesta2;
    private int respuestaValue2;
    private String respuesta3;
    private int respuestaValue3;
    private String respuesta4;
    private int respuestaValue4;

    public QuizCompleto(int preguntaID, String pregunta, String respuesta1, int respuestaValue1, String respuesta2, int respuestaValue2, String respuesta3, int respuestaValue3, String respuesta4, int respuestaValue4) {
        this.preguntaID = preguntaID;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuestaValue1 = respuestaValue1;
        this.respuesta2 = respuesta2;
        this.respuestaValue2 = respuestaValue2;
        this.respuesta3 = respuesta3;
        this.respuestaValue3 = respuestaValue3;
        this.respuesta4 = respuesta4;
        this.respuestaValue4 = respuestaValue4;
    }

    public QuizCompleto() {
    }

    public int getPreguntaID() {
        return preguntaID;
    }

    public void setPreguntaID(int preguntaID) {
        this.preguntaID = preguntaID;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public int getRespuestaValue1() {
        return respuestaValue1;
    }

    public void setRespuestaValue1(int respuestaValue1) {
        this.respuestaValue1 = respuestaValue1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public int getRespuestaValue2() {
        return respuestaValue2;
    }

    public void setRespuestaValue2(int respuestaValue2) {
        this.respuestaValue2 = respuestaValue2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public int getRespuestaValue3() {
        return respuestaValue3;
    }

    public void setRespuestaValue3(int respuestaValue3) {
        this.respuestaValue3 = respuestaValue3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public int getRespuestaValue4() {
        return respuestaValue4;
    }

    public void setRespuestaValue4(int respuestaValue4) {
        this.respuestaValue4 = respuestaValue4;
    }
}

