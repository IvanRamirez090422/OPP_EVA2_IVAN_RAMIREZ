/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva17_pract17_interfaces2_java;

/**
 *
 * @author user
 */
public class EVA17_PRACT17_INTERFACES2_JAVA {
//INTERFACES: SON COMO CLASES ABSTRACTAS PERO SON UN POCO MAS EXTREMOS Y NO SE PUEDEN INSTANCIAR

    public static void main(String[] args) {

    }
}

interface intA {

    void A();

}

interface intB {

    public abstract void B();
}

interface intC extends intA, intB {

    public abstract void C();
}

class Prueba implements intC {

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }

}
