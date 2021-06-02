/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Ciudad implements Serializable {

    private String identificacion;
    private String nombreCiudad;
    private String nombreProv;

    public Ciudad(String nombreC, String nombrePro, String id) {
        identificacion = id;
        nombreProv = nombrePro;
        nombreCiudad = nombreC;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public void establecerNombreProv(String n) {
        nombreProv = n;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerNombreProvincia() {
        return nombreProv;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    @Override

    public String toString() {
        return String.format("%s \n %s \n %s", nombreCiudad, nombreProv, identificacion);
    }

}
