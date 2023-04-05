/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva14_pract14_tienda_java;

/**
 *
 * @author user
 */
public abstract class Productos {

    private double precio;
    private String descripcion;
    private String unideventa;

    public Productos() {
        this.precio = 50;
        this.descripcion = "ado";
        this.unideventa = "12";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnideventa() {
        return unideventa;
    }

    public void setUnideventa(String unideventa) {
        this.unideventa = unideventa;
    }

    public Productos(double precio, String descripcion, String unideventa) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.unideventa = unideventa;
    }

}
