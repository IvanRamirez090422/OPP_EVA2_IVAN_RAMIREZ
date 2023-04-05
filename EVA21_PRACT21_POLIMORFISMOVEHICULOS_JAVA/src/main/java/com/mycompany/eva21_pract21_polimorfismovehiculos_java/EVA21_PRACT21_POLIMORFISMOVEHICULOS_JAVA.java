/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva21_pract21_polimorfismovehiculos_java;

/**
 *
 * @author user
 */
public class EVA21_PRACT21_POLIMORFISMOVEHICULOS_JAVA {

    public static void main(String[] args) {
Automovil auto = new Automovil("VOLKSWAGEN", 2000);
bicicleta bici= new bicicleta ();


    

        
    }


     
}
class vehiculo{
        private String marca;
     protected int Velocidad;  

    public vehiculo() {
    }

    public vehiculo(String marca, int Velocidad) {
        this.marca = marca;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

   
}
class Automovil extends vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
    }
    public void tablero (){
        System.out.println("");
        System.out.println("combustible " + "velocidad");
        System.out.println("");
    }
           

    public Automovil(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void ControlarVelocidad(int cambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

  
}
class bicicleta extends vehiculo{
    private String tipo;

    public bicicleta() {
    }

    public bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public static void modificarVel(ControlarDatos datos, int velocidad){
datos.ControlarVelocidad(velocidad);

}
}
