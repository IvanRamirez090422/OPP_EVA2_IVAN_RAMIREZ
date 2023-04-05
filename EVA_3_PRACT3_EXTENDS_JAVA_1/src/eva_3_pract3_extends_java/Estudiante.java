/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_3_pract3_extends_java;

/**
 *
 * @author user
 */  // CLASE DERIVADA extends CLASE BASE 
//CLASE HIJO extends CLASE PADRE
//SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona{
    public String nOcontrol;

    public String getnOcontrol() {
        return nOcontrol;
    }

    public void setnOcontrol(String nOcontrol) {
        this.nOcontrol = nOcontrol;
    }
}
