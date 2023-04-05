/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva14_pract14_tienda_java;

/**
 *
 * @author user
 */
public class Pantalones {
private String material;
private String corte;
private char genero;

    public Pantalones() {
    }


    public Pantalones(String material, String corte, char genero) {
        this.material = "Polliester";
        this.corte = "Cargo";
        this.genero = 'M';
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
