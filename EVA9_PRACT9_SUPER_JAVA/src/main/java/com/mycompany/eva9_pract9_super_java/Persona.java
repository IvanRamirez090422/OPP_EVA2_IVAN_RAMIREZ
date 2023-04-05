/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva9_pract9_super_java;

/**
 *
 * @author user
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {   
        this.nombre= "Ivan";    
        this.apellido= "Ramirez";    
        this.edad= 18;    
                }
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
public void imprimirdatos(){
    System.out.println("DATOS " );
    System.out.println("Nombre: "+ this.nombre);
    System.out.println("Apellidos: " + this.apellido);
    System.out.println("Edad: " + this.edad);
}
}
