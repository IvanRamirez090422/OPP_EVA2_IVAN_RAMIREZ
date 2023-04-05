/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva14_pract14_tienda_java;

/**
 *
 * @author user
 */
public abstract class Electronica extends Productos{

    private String fabricante;
    private String modelo;
    private int garantia;

    public Electronica(String fabricante, String modelo, int garantia) {
        this.fabricante = "Dior";
        this.modelo = "modelo negra";
        this.garantia = 5 ;
    }
    
    

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public Electronica() {
        super();
    }
    
    
}
