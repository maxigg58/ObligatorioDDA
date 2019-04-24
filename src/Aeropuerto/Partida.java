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
public class Partida extends Vuelo{
    
    Date horaRealLlegada;
    Date horaActual;
    Date diferenciaHora;
    boolean despegue;
    
    
    public Partida(Date horaRealLlegada, Date horaActual, Date diferenciaHora, boolean despegue, Frecuencia frecuenciaSeleccionada) {
        super(frecuenciaSeleccionada);
        this.horaRealLlegada = horaRealLlegada;
        this.horaActual = horaActual;
        this.diferenciaHora = diferenciaHora;
        this.despegue = despegue;
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

    public boolean isDespegue() {
        return despegue;
    }

    public void setDespegue(boolean despegue) {
        this.despegue = despegue;
    }


    

    
}
