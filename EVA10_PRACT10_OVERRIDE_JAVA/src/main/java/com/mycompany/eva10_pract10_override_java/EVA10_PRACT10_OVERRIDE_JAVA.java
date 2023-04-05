/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva10_pract10_override_java;

/**
 *
 * @author user
 */
public class EVA10_PRACT10_OVERRIDE_JAVA {

    public static void main(String[] args) {

        Persona perso = new Persona();
        Persona perso2 = new Persona("Ivan Ramirez", 18);
        System.out.println(perso);
        System.out.println(perso2);
    }

}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Ivan";
        this.edad = 18;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {

        String cade = "Datos: /n"
                + "nombre" + nombre + "/n"
                + "edad" + edad;
        return cade;

    }
}
