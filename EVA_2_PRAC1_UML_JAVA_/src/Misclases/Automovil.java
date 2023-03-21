/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misclases;

/**
 *
 * @author user
 */
public class Automovil {

    private String marca;
    private int año;
    private int modelo;

    public Automovil(){
           
            marca = "BMW";
            modelo = 2016;
            año= 2004 ;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        
    }
      public void imprimirDatos() {
        System.out.println("marca: " + marca );
        System.out.println("año:" + año);
        System.out.println("modelo:" + modelo);
       
    }
}