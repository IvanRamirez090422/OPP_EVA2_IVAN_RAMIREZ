/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_5_pract5_herncia_java;

/**
 *
 * @author user
 */
public class EVA_5_PRACT5_HERNCIA_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //en java
        // TODAS LAS CLASES TIENEN COMO SUPERCLASE A LA CLASE object
    //object
        //
        //
        //
    //SUPER CLASE
        //
        //
        //
   //SUB CLASE
        subClase obj = new subClase();
        obj.mensaje();
    }

}

class superClase {

    public void mensaje() {
        System.out.println("Hola");
    }
}

class subClase extends superClase {

}
