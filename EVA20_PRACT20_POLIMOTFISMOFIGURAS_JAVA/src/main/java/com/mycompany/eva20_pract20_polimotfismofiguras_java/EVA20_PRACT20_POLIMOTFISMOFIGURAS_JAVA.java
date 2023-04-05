/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva20_pract20_polimotfismofiguras_java;

/**
 *
 * @author user
 */
public class EVA20_PRACT20_POLIMOTFISMOFIGURAS_JAVA {

    public static void main(String[] args) {
        Circulo circu = new Circulo(5);
        circu.imprimirDatos();
//COMO FIGURA ES PADRE DE CIRCULO
//PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE
        Figuras figu = circu; 
        System.out.println("USANDO FIGURAS:");
        System.out.println("Area:" + circu.calcularArea());
        System.out.println("Perimetro:" + circu.calcularPeri());
        

    }
}
