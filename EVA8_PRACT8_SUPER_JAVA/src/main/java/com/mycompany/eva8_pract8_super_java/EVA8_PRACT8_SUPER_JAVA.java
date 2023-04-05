/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva8_pract8_super_java;

/**
 *
 * @author user
 */
public class EVA8_PRACT8_SUPER_JAVA {

    public static void main(String[] args) {

//SUPER: Hace referencia a la superclase o clase padre.
        Animal ani = new Animal(100);
        Mamifero mami = new Mamifero("negro", 50);
        Perros perro = new Perros();
    }
}

class Animal {

    private int peso;

    public Animal() {
        System.out.println("Estoy vivo");

    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("CONSTRUCTOR 2");

    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

class Mamifero extends Animal {

    public Mamifero(String colorPelo, int peso) {
        super(peso);//LLAMAMOS AL CONSTRUCTOR DE LA SUPERCLASE
        this.colorPelo = colorPelo;
        System.out.println("2 CONSTRUCTOR DE LA CLASE MAMIFERO");

    }
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Mamifero() {
        super();
        //LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE.
        //EN NUESTRO CASO, LLAMA A "ANIMAL"
        //siempre debemos llamar primero
        //al constructor de la superclase'
        System.out.println("Soy un mamifero putos");
    }
}

class Perros extends Mamifero {

    public Perros() {
        //SIEMPRE HAY QUE INVOCAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("Soy chapo y soy un perro gordo");
    }

}
