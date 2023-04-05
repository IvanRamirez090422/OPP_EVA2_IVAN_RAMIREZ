/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_clases_java;

/**
 *
 * @author user
 */
public class EVA_3_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.setnomCliente("Carlos Slim");
        cuenta1.setSaldo(1200);
        cuenta1.setnoCuenta("100");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getnomCliente());
        System.out.println(cuenta1.getnocuenta());
        System.out.println(cuenta1.getSaldo());

        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getnomCliente());
        System.out.println(cuenta2.getnocuenta());
        System.out.println(cuenta2.getSaldo());
        
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getnomCliente());
        System.out.println(cuenta3.getnocuenta());
        System.out.println(cuenta3.getSaldo());
    }
}
