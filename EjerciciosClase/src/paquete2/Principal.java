/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/

        InstitucionEducativa i1 = new InstitucionEducativa();

        String nombre = "Univercidad Tecnica Particular De Loja";
        String tipoInstitucion = "Privada";
        int numeroAlumnos = 25000;
        int numeroDocentes = 5000;
        int numeroSedes = 90;

        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);

        System.out.printf("Institucion Educativa\n"
                + "\nNombre: %s"
                + "\nTipo de Institucion: %s"
                + "\nNumero de Alumnos: %d"
                + "\nNumero de Docentes: %d"
                + "\nNumero de Sedes %d   ",
                i1.obtenerNombre(),
                i1.obtenerTipoInstitucion(),
                i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(),
                i1.obtenerNumeroSedes());
    }
}
