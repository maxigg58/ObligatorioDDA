/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Compania.Compania;

/**
 *
 * @author Maximiliano
 */
public class UsuCompania extends Usuario{
    
    public Compania companiaTrabaja;


    public UsuCompania(String nombre, String apellido, String nombreUsuario, String password, Compania companiaTrabaja) {
        super(nombre, apellido, nombreUsuario, password);
        this.companiaTrabaja = companiaTrabaja;
    }

    public UsuCompania() {
    }

    public Compania getCompaniaTrabaja() {
        return companiaTrabaja;
    }

    public void setCompaniaTrabaja(Compania companiaTrabaja) {
        this.companiaTrabaja = companiaTrabaja;
    }
    
    
    
}
