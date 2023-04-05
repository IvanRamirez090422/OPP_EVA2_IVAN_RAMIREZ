/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva19_pract19_polymorfhysm_java;

/**
 *
 * @author user
 */
public class Estudiante {
     private String nombre;
    private String apellido;
    private int edad;
    public String noCOntrol;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String noCOntrol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.noCOntrol = noCOntrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoCOntrol() {
        return noCOntrol;
    }

    public void setNoCOntrol(String noCOntrol) {
        this.noCOntrol = noCOntrol;
    }
    
      public void imprimirDatos() {
      }
}
