/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import Compania.Frecuencia;

/**
 *
 * @author Maximiliano
 */
public class Vuelo {
    
    Frecuencia frecuenciaSeleccionada;

    public Vuelo() {
    }

    public Vuelo(Frecuencia frecuenciaSeleccionada) {
        this.frecuenciaSeleccionada = frecuenciaSeleccionada;
    }

  
    public Frecuencia getFrecuenciaSeleccionada() {
        return frecuenciaSeleccionada;
    }

    public void setFrecuenciaSeleccionada(Frecuencia frecuenciaSeleccionada) {
        this.frecuenciaSeleccionada = frecuenciaSeleccionada;
    }
    
    
}
