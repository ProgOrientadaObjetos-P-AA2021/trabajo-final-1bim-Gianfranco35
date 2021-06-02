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
public class Departamento implements Serializable {

    private String nombreEdificio;
    private String ubicacionEnEdificio;
    private int numeroCuartos;
    private double valorCuotaMensual;
    private double costoTotal;
    private Ubicacion ubicacion;
    private double precioMCuadrado;
    private Constructora constructora;
    private Ciudad ciudad;
    private double precio;
    private Propietario propietario;
    private String identificacion;
    private double mCuadrados;

    public Departamento(String nomEdi, String ubiEdi, int nCuartos,
            double valormensual, Ubicacion ubi, double precioMC,
            Constructora ct, Ciudad cd, double prec,
            Propietario prop, String id, double mCuad) {
        nombreEdificio = nomEdi;
        ubicacionEnEdificio = ubiEdi;
        numeroCuartos = nCuartos;
        valorCuotaMensual = valormensual;
        ubicacion = ubi;
        precioMCuadrado = precioMC;
        constructora = ct;
        ciudad = cd;
        precio = prec;
        propietario = prop;
        identificacion = id;
        mCuadrados = mCuad;
    }

    public void establecerNombreEdificio(String nomEdi) {
        nombreEdificio = nomEdi;
    }

    public void establecerUbicacionEnEdificio(String ubiEdi) {
        ubicacionEnEdificio = ubiEdi;
    }

    public void establecerNumeroCuartos(int nCuartos) {
        numeroCuartos = nCuartos;
    }

    public void establecerValorCuotaMensual(double CuotaMensual) {
        valorCuotaMensual = CuotaMensual;
    }

    public void establecerUbicacion(Ubicacion ubi) {
        ubicacion = ubi;
    }

    public void establecerPrecioMetroCuadrado(double precioMC) {
        precioMCuadrado = precioMC;
    }

    public void establecerConstructora(Constructora ct) {
        constructora = ct;
    }

    public void establecerCiudad(Ciudad cd) {
        ciudad = cd;
    }

    public void establecerPrecio(double prec) {
        precio = prec;
    }

    public void establecerPropietario(Propietario prop) {
        propietario = prop;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public void establecerMCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public void calcularCostoTotal() {
        this.costoTotal = (mCuadrados * precioMCuadrado) + valorCuotaMensual * 12;
    }

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacionEnEdificio() {
        return ubicacionEnEdificio;
    }

    public int obtenerNumeroCuartos() {
        return numeroCuartos;
    }

    public double obtenerValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMCuadrado;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public double obtenerMCuadrados() {
        return mCuadrados;
    }

    public double obtenerCostoTotal() {
        return costoTotal;
    }

    @Override

    public String toString() {
        return identificacion + "\n" + precioMCuadrado + "\n" + nombreEdificio + "\n"
                + mCuadrados + "\n" + costoTotal + "\n" + precio + "\n"
                + valorCuotaMensual + "\n" + ubicacion.obtenerNombreReferencia()
                + "\n" + ubicacionEnEdificio + "\n" + propietario.obtenerIdentificacion() + "\n"
                + ciudad.obtenerIdentificacion() + "\n" + numeroCuartos + "\n"
                + constructora.obtenerIdentificacion() + "\n" + ubicacion.obtenerIdentificacion();
    }

}
