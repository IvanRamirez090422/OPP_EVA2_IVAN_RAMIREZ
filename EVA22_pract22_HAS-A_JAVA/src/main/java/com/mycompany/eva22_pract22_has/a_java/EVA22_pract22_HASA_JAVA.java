/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva22_pract22_has.a_java;

/**
 *
 * @author user
 */
public class EVA22_pract22_HASA_JAVA {

    public static void main(String[] args) {
Persona perso = new Persona ();
perso.setNombre("Ivan");
perso.setApellido("Ramirez");
perso.setEdad(18);
perso.imprimirDatos();

Direccion direccion = new Direccion ();
direccion.setCalle("Av.Industrias");
direccion.setCiudad("Chihuahua");
direccion.setColonia("Complejo Industrial");
direccion.setCp("31305");

    }
}
class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String ciudad;
    private String estado;
    private String cp;

    public Direccion() {
    }

    public Direccion(String calle, int numero, String colonia, String ciudad, String estado, String cp) {
        this.calle = "mina";
        this.numero = 18;
        this.colonia = "por";
        this.ciudad = "chihua";
        this.estado = "chihuas";
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
public void imprimirDatos(){
    System.out.println("Direccion:");
    System.out.println(calle + " #" + numero + "," + colonia + ",C.P.:" + cp + "," + ciudad + "," + estado);
}
    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = "Ivan";
        this.apellido = "Ramirez";
        this.edad = 18;
        this.direccion = null;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

       public void imprimirDatos() {
           System.out.println("persona:");
           System.out.println(nombre +" " + apellido + "," + edad + "años");
           direccion.imprimirDatos();
          
    } 
}