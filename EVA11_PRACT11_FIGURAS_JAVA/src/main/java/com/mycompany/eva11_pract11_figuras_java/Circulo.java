/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva11_pract11_figuras_java;

/**
 *
 * @author user
 */
public class Circulo {
    

    private double radio;
    private double pi;

    public Circulo() {
        radio = 5;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double calcularArea(double radio, double pi) {
        double area = pi*radio*radio;
        return area;
    }
public double calcularperimetro (double radio, double pi){ 
    double perimetro = pi*radio * 2;
    
    return  perimetro;
}
}

