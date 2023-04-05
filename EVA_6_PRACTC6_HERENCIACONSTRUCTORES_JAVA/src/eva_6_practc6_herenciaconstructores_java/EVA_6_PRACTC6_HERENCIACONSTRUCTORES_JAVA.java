/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_6_practc6_herenciaconstructores_java;

/**
 *
 * @author user
 */
public class EVA_6_PRACTC6_HERENCIACONSTRUCTORES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EL PROGRAMADOR ESTA OBLIGADO A LLAMAR A LOS CONSTRUCTORES 
        
        System.out.println("CLASE ANIMAL");
        Animal anim = new Animal();
        anim.comer();
        anim.respirar();
        System.out.println("CLASE MAMIFERO");
        Mamiferos mami1 = new Mamiferos();
        mami1.comer();
        mami1.respirar();
        mami1.tenerPelo();
    }
    
}
