/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva14_pract14_tienda_java;

/**
 *
 * @author user
 */
public final class Computadora extends Electronica {
private int memoria;    
private String procesador;   
private double tamaño;   
private double discoDuro;

    public Computadora(String fabricante, String modelo, int garantia) {
        super(fabricante, modelo, garantia);
        //antes de cierta cantidad manejamos precio normal despues de ciertas unidades hacemos un descuento
        
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

}
//FINAL --> NO SE PUEDE HEREDAR UNA CLASE MARCADA CON FINAL.
//class laptop extends Computadora{
    
