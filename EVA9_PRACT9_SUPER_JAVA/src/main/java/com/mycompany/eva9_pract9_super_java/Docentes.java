/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva9_pract9_super_java;

/**
 *
 * @author user
 */
public class Docentes extends Estudiante{
    private String plaza;

    public Docentes() {
        super();
        this.plaza = "del chapio";
    }
    
    

    public Docentes(String plaza, String nOcontrol,String apellido, String nombre, int edad ) {
        super();
        this.plaza = plaza;
    }

     
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
        @Override
    public void imprimirdatos() {
super.imprimirdatos();
        System.out.println("plaza:" + plaza);
    }

    
}
