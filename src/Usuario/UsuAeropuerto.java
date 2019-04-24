/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Aeropuerto.Aeropuerto;

/**
 *
 * @author Maximiliano
 */
public class UsuAeropuerto extends Usuario {
    
    Aeropuerto aeropuertoTrabaja;

    public UsuAeropuerto(Aeropuerto aeropuertoTrabaja, String nombre, String apellido, String nombreUsuario, String password) {
        super(nombre, apellido, nombreUsuario, password);
        this.aeropuertoTrabaja = aeropuertoTrabaja;
    }

    public Aeropuerto getAeropuertoTrabaja() {
        return aeropuertoTrabaja;
    }

    public void setAeropuertoTrabaja(Aeropuerto aeropuertoTrabaja) {
        this.aeropuertoTrabaja = aeropuertoTrabaja;
    }

    
    
}
