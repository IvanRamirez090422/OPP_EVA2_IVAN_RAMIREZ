package com.mycompany.eva20_pract20_polimotfismofiguras_java;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Triangulo_1 implements Figuras, MostrarDatos {

    private double base;
    private double altura;

    public Triangulo_1() {
    }

    public Triangulo_1(double base, double altura) {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    
    public double calcularPeri() {

        double hip = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + (hip);
    }

    public void imprimirDatos() {
        
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
        System.out.println("Radio: " + "radio");
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPeri());
    }

}
    

