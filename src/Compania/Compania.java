/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compania;

/**
 *
 * @author Maximiliano
 */
public class Compania {
    
    String nombre;
    String alias;

    public Compania() {
    }

    public Compania(String nombre, String alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    
}
