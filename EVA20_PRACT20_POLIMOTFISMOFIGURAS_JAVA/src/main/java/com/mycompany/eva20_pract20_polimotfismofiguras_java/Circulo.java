package com.mycompany.eva20_pract20_polimotfismofiguras_java;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Circulo  implements Figuras, MostrarDatos {
//LA INTERFACE ES COMO UN CONTRATO, TE OBLIGA A SEGUIR UN CIERTO COMPORTAMIENTO
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Radio: " + radio);
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPeri());
    }
    
}
    

