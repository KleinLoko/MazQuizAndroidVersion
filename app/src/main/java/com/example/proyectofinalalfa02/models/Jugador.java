package com.example.proyectofinalalfa02.models;

import org.jetbrains.annotations.NotNull;

public class Jugador {

    //declaracion de atributos de un jugador
    private int jug_id; //id del jugador
    private String jug_nombre;//nombre del jugador
    private String jug_apellidopat;//apellido paterno del jugador
    private String jug_apellidomat; //apellido materno del jugador
    private String jug_carrera; //carrera del jugador
    private int jug_puntaje; //puntaje del jugador
    private String jug_password; //contraseña del jugador

    /**
     * Constructor vacio
     */
    public Jugador() {
    }

    /**
     * Constructor de la clase Jugador que incluye 7 parametros
     * @param jug_id
     * @param jug_nombre
     * @param jug_apellidopat
     * @param jug_apellidomat
     * @param jug_carrera
     * @param jug_puntaje
     * @param jug_password
     */
    public Jugador(@NotNull int jug_id, @NotNull String jug_nombre, @NotNull String jug_apellidopat, @NotNull String jug_apellidomat, @NotNull String jug_carrera, @NotNull int jug_puntaje, @NotNull String jug_password) {
        this.jug_id = jug_id;
        this.jug_nombre = jug_nombre;
        this.jug_apellidopat = jug_apellidopat;
        this.jug_apellidomat = jug_apellidomat;
        this.jug_carrera = jug_carrera;
        this.jug_puntaje = jug_puntaje;
        this.jug_password = jug_password;
    }

    /**
     * Devuelve el id del jugador
     * @return
     */
    public int getJug_id() {
        return jug_id;
    }

    /**
     * Establece el id del jugador
     * @param jug_id
     */
    public void setJug_id(int jug_id) {
        this.jug_id = jug_id;
    }

    /**
     * Devuelve el nombre del jugador
     * @return
     */
    public String getJug_nombre() {
        return jug_nombre;
    }

    /**
     * Establece el nombre del jugador
     * @param jug_nombre
     */
    public void setJug_nombre(String jug_nombre) {
        this.jug_nombre = jug_nombre;
    }

    /**
     * Devuelve el apellido paterno del jugador
     * @return
     */
    public String getJug_apellidopat() {
        return jug_apellidopat;
    }

    /**
     * Establece el apellido paterno del jugador
     * @param jug_apellidopat
     */
    public void setJug_apellidopat(String jug_apellidopat) {
        this.jug_apellidopat = jug_apellidopat;
    }

    /**
     * Devuelve el apellido materno del jugador
     * @return
     */
    public String getJug_apellidomat() {
        return jug_apellidomat;
    }

    /**
     * Establece el apellido materno del jugador
     * @param jug_apellidomat
     */
    public void setJug_apellidomat(String jug_apellidomat) {
        this.jug_apellidomat = jug_apellidomat;
    }

    /**
     * Retorna la carrera del jugador
     * @return
     */
    public String getJug_carrera() {
        return jug_carrera;
    }

    /**
     * Establece la carrera del jugador
     * @param jug_carrera
     */
    public void setJug_carrera(String jug_carrera) {
        this.jug_carrera = jug_carrera;
    }

    /**
     * Devuelve el puntaje del jugador
     * @return
     */
    public int getJug_puntaje() {
        return jug_puntaje;
    }

    /**
     * Establece el puntaje del jugador
     * @param jug_puntaje
     */
    public void setJug_puntaje(int jug_puntaje) {
        this.jug_puntaje = jug_puntaje;
    }

    /**
     * Devuelve la password del jugador
     * @return
     */
    public String getJug_passwaord() {
        return jug_password;
    }

    /**
     * Establece el password del jugador
     * @param jug_password
     */
    public void setJug_password(String jug_password) {
        this.jug_password = jug_password;
    }
}
