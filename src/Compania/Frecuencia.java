/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compania;

import Aeropuerto.Aeropuerto;
import java.util.Date;

/**
 *
 * @author Maximiliano
 */
public class Frecuencia {
    
    String numVuelo;
    Aeropuerto origen;
    Aeropuerto destino;
    Date hora;
    int dureacion;
    char diaSemana;
    boolean frecuenciaAprobadaOrigen;
    boolean frecuenciaAprobadaDestino;

    public Frecuencia(String numVuelo, Aeropuerto origen, Aeropuerto destino, Date hora, int dureacion, char diaSemana, boolean frecuenciaAprobadaOrigen, boolean frecuenciaAprobadaDestino) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.dureacion = dureacion;
        this.diaSemana = diaSemana;
        this.frecuenciaAprobadaOrigen = frecuenciaAprobadaOrigen;
        this.frecuenciaAprobadaDestino = frecuenciaAprobadaDestino;
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getDureacion() {
        return dureacion;
    }

    public void setDureacion(int dureacion) {
        this.dureacion = dureacion;
    }

    public char getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(char diaSemana) {
        this.diaSemana = diaSemana;
    }

    public boolean isFrecuenciaAprobadaOrigen() {
        return frecuenciaAprobadaOrigen;
    }

    public void setFrecuenciaAprobadaOrigen(boolean frecuenciaAprobadaOrigen) {
        this.frecuenciaAprobadaOrigen = frecuenciaAprobadaOrigen;
    }

    public boolean isFrecuenciaAprobadaDestino() {
        return frecuenciaAprobadaDestino;
    }

    public void setFrecuenciaAprobadaDestino(boolean frecuenciaAprobadaDestino) {
        this.frecuenciaAprobadaDestino = frecuenciaAprobadaDestino;
    }
    
    
    
    
    
}
