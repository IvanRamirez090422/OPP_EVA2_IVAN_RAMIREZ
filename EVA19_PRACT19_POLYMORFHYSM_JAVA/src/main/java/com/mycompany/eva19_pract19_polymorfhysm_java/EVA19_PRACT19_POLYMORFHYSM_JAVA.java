/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva19_pract19_polymorfhysm_java;

/**
 *
 * @author user
 */
public class EVA19_PRACT19_POLYMORFHYSM_JAVA {

    public static void main(String[] args) {
       //POLIMORFISMO: VA DE LA DE LA SUBCLASE A LA SUPERCLASE.
       //IS-A (ES UN).
Docentes doce= new Docentes ();
doce.imprimirDatos();
Estudiante estu= new Estudiante ();
estu.imprimirDatos();
Persona perso = new Persona();
perso.imprimirDatos();
//Docentes doce = perso;
//AHORA NO SE PUEDE HACER LA CONVERSION ALREVES OSEA DE SUPERCLASE O SUBCLASE, EN ESTE CASO NO EXISTE LA PLAZA.
//EN RESUMEN ESTO ES POLIMORFISMO
//Persona perso = doce;
//Persona perso2 = estu;
//perso2. imprimirDatos();
    }
}
