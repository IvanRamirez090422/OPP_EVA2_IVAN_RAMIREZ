/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva16_interfaces;

/**
 *
 * @author user
 */
public class EVA16_INTERFACES {

    public static void main(String[] args) {
        //MostraDatos obj = new MostrarDatos (); NO SE PUEDE INSTANCIAR UNA INTERFACE
        Persona perso = new Persona();
        perso.imprimirdatos();
        computadora compu = new computadora();
        compu.imprimirdatos();
    }
}
