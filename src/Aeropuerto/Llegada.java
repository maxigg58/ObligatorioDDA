/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import Compania.Frecuencia;
import java.util.Date;

/**
 *
 * @author Maximiliano
 */
public class Llegada extends Vuelo{
    
    Date horaRealLlegada;
    Date horaActual;
    Date diferenciaHora;
    boolean llegada;

    public Llegada() {
    }


    public Llegada(Date horaRealLlegada, Date horaActual, Date diferenciaHora, boolean llegada, Frecuencia frecuenciaSeleccionada) {
        super(frecuenciaSeleccionada);
        this.horaRealLlegada = horaRealLlegada;
        this.horaActual = horaActual;
        this.diferenciaHora = diferenciaHora;
        this.llegada = llegada;
    }

    public Date getHoraRealLlegada() {
        return horaRealLlegada;
    }

    public void setHoraRealLlegada(Date horaRealLlegada) {
        this.horaRealLlegada = horaRealLlegada;
    }

    public Date getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(Date horaActual) {
        this.horaActual = horaActual;
    }

    public Date getDiferenciaHora() {
        return diferenciaHora;
    }

    public void setDiferenciaHora(Date diferenciaHora) {
        this.diferenciaHora = diferenciaHora;
    }

    public boolean isLlegada() {
        return llegada;
    }

    public void setLlegada(boolean llegada) {
        this.llegada = llegada;
    }
    
    
    
}
