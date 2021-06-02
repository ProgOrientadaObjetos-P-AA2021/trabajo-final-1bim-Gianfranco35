/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;

/**
 *
 * @author Usuario iTC
 */
public class Casa implements Serializable {

    private String identificacion;
    private double mCuadrados;
    private Ubicacion ubicacion;
    private double mCuadradosPrecio;
    private Propietario propietario;
    private double costoTotal;
    private int nCuartos;
    private Constructora constructora;
    private Ciudad ciudad;

    public Casa(String id, double mcua, Ubicacion ubi, double preciomc, Propietario prop,
            int num, Constructora ct, Ciudad cd) {
        identificacion = id;
        mCuadrados = mcua;
        ubicacion = ubi;
        mCuadradosPrecio = preciomc;
        propietario = prop;
        nCuartos = num;
        constructora = ct;
        ciudad = cd;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public void establecerMCuadrados(double mcua) {
        mCuadrados = mcua;
    }

    public void establecerUbicacion(Ubicacion ubi) {
        ubicacion = ubi;
    }

    public void establecerMCuadradosPrecio(double preciomc) {
        mCuadradosPrecio =preciomc;
    }

    public void establecerPropietario(Propietario prop) {
        propietario = prop;
    }

    public void establecerCostoTotal(double ct) {
        costoTotal = ct;
    }

    public void estabelcernCuartos(int num) {
        nCuartos = num;
    }

    public void establecerConstructora(Constructora ct) {
        constructora = ct;
    }

    public void establecerCiudad(Ciudad cd) {
        ciudad = cd;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public double obtenerMCuadrados() {
        return mCuadrados;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public double obtenerMCuadradosPrecio() {
        return mCuadradosPrecio;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double calcularCostoTotal() {
        return costoTotal;
    }

    public int obtenerNCuartos() {
        return nCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    @Override

    public String toString() {
        return String.format("%s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", identificacion, mCuadrados,
                costoTotal, nCuartos, mCuadradosPrecio,
                propietario.obtenerIdentificacion(), ubicacion.obtenerIdentificacion(),
                ciudad.obtenerNombreCiudad(), constructora.obtenerIdentificacion());
    }
}
