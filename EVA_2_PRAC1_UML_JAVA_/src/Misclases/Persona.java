/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misclases;

/**
 *
 * @author user
 */
public class Persona {

    private char id;
    private int Edad;
    private String Nombre;
  

    public int getEdad() {
        return Edad;

    }

    public void setEdad(int edad) {
        this.Edad = edad;

    }

    public String getNombre() {
        return Nombre;

    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;

    }

    public char getid() {
        return id;
    }

    public void setid(char idd) {
        this.id = idd;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre );
        System.out.println("Edad:" + Edad);
        System.out.println("id:" + id);
       
    }

}
