/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva9_pract9_super_java;

/**
 *
 * @author user
 */  // CLASE DERIVADA extends CLASE BASE 
//CLASE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {

    public String nOcontrol;

    public Estudiante() {//LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        super();
        this.nOcontrol = "22550352";
    }

    public Estudiante(String nOcontrol,String apellido, String nombre, int edad) {
        super(nombre, apellido, edad);
        this.nOcontrol= nOcontrol;

    }

    public String getnOcontrol() {
        return nOcontrol;
    }

    public void setnOcontrol(String nOcontrol) {
        this.nOcontrol = nOcontrol;
    }
    
//REMPLAZAR EL METODO imprimirdatos de la SUPERCLASE.
    @Override
    public void imprimirdatos() {
super.imprimirdatos();
        System.out.println("numcontrol:" + nOcontrol);
    }

}
