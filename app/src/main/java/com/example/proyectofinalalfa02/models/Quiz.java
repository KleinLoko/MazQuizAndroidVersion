package com.example.proyectofinalalfa02.models;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class Quiz {

    private int idQuiz;
    private int preID;
    private String pregunta;
    private int resID;
    private String respuesta;
    private int correcta;

    public Quiz() {
    }

    public Quiz(@NotNull int idQuiz,@NotNull int preID, @NotNull String pregunta, @NotNull int resID, @NotNull String respuesta, @NotNull int correcta) {
        this.idQuiz = idQuiz;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.correcta = correcta;
        this.resID = resID;
        this.preID =  preID;
    }

    public int getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(int idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    public int getResID() {return resID;}

    public void setResID(int resID) {this.resID = resID;}

    public int getPreID() {return preID;}

    public void setPreID(int preID) {this.preID = preID;}
}
