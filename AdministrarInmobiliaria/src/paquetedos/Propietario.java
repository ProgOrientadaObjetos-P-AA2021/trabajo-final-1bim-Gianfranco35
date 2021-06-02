/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Propietario implements Serializable {

    String identificacion;
    String nombresPropietario;
    String apellidosPropietario;

    public Propietario(String id, String nombres, String apellidos) {
        nombresPropietario = nombres;
        apellidosPropietario = apellidos;
        identificacion = id;
    }

    public void establecerNombresPropietario(String nombres) {
        nombresPropietario = nombres;
    }

    public void establecerApellidosPropietario(String apellidos) {
        apellidosPropietario = apellidos;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public String obtenerApellidosPropietario() {
        return apellidosPropietario;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    @Override

    public String toString() {
        return String.format("%s \n %s \n %s", identificacion, nombresPropietario,
                apellidosPropietario);
    }
}
