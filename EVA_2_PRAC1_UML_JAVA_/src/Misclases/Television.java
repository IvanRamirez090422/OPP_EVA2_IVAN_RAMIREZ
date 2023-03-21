/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misclases;

/**
 *
 * @author user
 */
public class Television {

    private int volumen;
    private int canal;
    private boolean power;
//METODOS=comportamiento
    //constructor

    public Television() {

        power = false; //apagada
        volumen = 90;
        canal = 3;

    }

    public void cambiarpower() {
        if (power == false) {
            power = true;
            System.out.println("TELEVISION PRENDIDA");
        } else {
            power = false;
            System.out.println("TELEVISION APAGADA");

        }
    }

    public void subirvolumen() {
        if (power == true) {
            if (volumen < 100) {

                volumen = volumen + 5;

                System.out.println("volumen: " + volumen);
            }

        }
    }

    public void bajarvolumen() {
        if (power == true) {
            if (volumen > 0) {
                volumen = volumen - 5;

                System.out.println("volumen: " + volumen);

            }
        }

    }

    public void subircanal() {
        if (power == true) {
            if (canal < 100) {
                canal = canal + 1;
            } else {
                canal = 0;
            }

            System.out.println("canal:" + canal);
        }

    }

    public void bajarcanal() {
        if (power == true) {
            if (canal > 0) {

            } else {
                canal = 100;
            }

            canal = canal - 1;
            System.out.println(" canal: " + canal);
        }
    }

}
