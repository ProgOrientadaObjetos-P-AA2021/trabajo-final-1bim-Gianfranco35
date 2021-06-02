/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paqueteseis.Casa;
import paqueteseis.Departamento;
import paquetetres.Ubicacion;

/**
 *
 * @author Usuario iTC
 */
public class Deserializador {

    public Propietario deserializarPropietario(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Propietario propietario = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\propietario\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            propietario = (Propietario) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return propietario;
    }

    public Ubicacion deserializarUbicacion(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Ubicacion ubicacion = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\ubicacion\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            ubicacion = (Ubicacion) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ubicacion;
    }

    public Ciudad deserializarCiudad(String nomCarpeta, String nomArchivo) throws IOException {
        Ciudad ciudad = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\ciudad\\" + nomCarpeta + "\\" + nomArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            ciudad = (Ciudad) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ciudad;
    }

    public Constructora deserializarConstructora(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Constructora constructora = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\constructora\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            constructora = (Constructora) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return constructora;

    }

    public Casa deserializarCasa(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Casa casa = null;
        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\casa\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            casa = (Casa) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return casa;
    }

    public Departamento deserializarDepartamento(String nomCarpeta, String nomArchivo)
            throws IOException {

        Departamento departamento = null;
        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\departamento\\" + nomCarpeta + "\\" + nomArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            departamento = (Departamento) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return departamento;
    }
}
