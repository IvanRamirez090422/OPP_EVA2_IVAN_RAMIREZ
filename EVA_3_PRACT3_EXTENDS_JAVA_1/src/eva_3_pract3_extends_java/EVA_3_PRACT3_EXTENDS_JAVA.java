/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_pract3_extends_java;

/**
 *
 * @author user
 */
public class EVA_3_PRACT3_EXTENDS_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante Estu = new Estudiante ();
        Estu.setEdad(20);
       
        System.out.println(Estu.getNombre());
        System.out.println(Estu.getApellido());
        System.out.println(Estu.getEdad());
        System.out.println(Estu.getnOcontrol());
        
        Docentes doce = new Docentes();
        System.out.println(doce.getPlaza());
        System.out.println(doce.getNombre());
        System.out.println(doce.getEdad());
        System.out.println(Estu.getnOcontrol());
    }
    
}
