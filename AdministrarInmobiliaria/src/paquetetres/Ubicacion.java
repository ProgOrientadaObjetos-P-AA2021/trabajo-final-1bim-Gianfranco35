/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Ubicacion implements Serializable {

    private String identificacion;
    private String nombreBarrio;
    private String referencia;
    private int numeroCasa;

    public Ubicacion(int numCasa, String nombreB, String ref,
            String id) {
        identificacion = id;
        nombreBarrio = nombreB;
        referencia = ref;
        numeroCasa = numCasa;
    }

    public void establecerNumCasa(int numCasa) {
        numeroCasa = numCasa;
    }

    public void establecerReferencia(String refere) {
        referencia = refere;
    }

    public void establecerNombreBarrio(String nomBarrio) {
        nombreBarrio = nomBarrio;
    }

    public void estabelceridentificacion(String id) {
        identificacion = id;
    }

    public int obtenerNumeroCasa() {
        return numeroCasa;
    }

    public String obtenerReferencia() {
        return referencia;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String obtenerNombreReferencia() {
        return nombreBarrio;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    @Override

    public String toString() {
        return numeroCasa + "\n" + nombreBarrio + "\n" + referencia + "\n" + identificacion;
    }
}
