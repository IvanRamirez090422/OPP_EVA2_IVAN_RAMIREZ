/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva16_interfaces;

/**
 *
 * @author user
 */
public class computadora extends Producto implements MostrarDatos{// heredamos de clase e implementamos de interfaces.

    private String procesador;
    private String marca;

    public computadora() {
    
    }

    public computadora(String procesador, String marca, double precio, String Nombre) {
        super(precio, Nombre);
        this.procesador = procesador;
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("precio: " + getPrecio() );
    }
}
