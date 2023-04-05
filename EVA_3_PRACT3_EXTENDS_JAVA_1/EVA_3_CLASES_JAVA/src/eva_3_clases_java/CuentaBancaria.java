/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_3_clases_java;

/**
 *
 * @author user
 */
public class CuentaBancaria {

    private double Saldo;
    private String noCuenta;
    private String nomCliente;
//metodos get y set
    //MODIFICADOR DE ACCESO DE NOMBRE DE LA CLASE(ARGUMENTOS)

    public CuentaBancaria() {//CONSTRUCTOR DEFAULT
        noCuenta = "0000000000";
        Saldo = 100000;
        nomCliente = "";

    }

    public String getnocuenta() {
        return noCuenta;
    }

    public String getnomCliente() {
        return nomCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setnoCuenta(String cuenta) {
        this.noCuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public void setnomCliente(String cliente) {
        this.nomCliente = cliente;
    }

    public CuentaBancaria(String nCuenta, double cant, String nCliente) {

        noCuenta = nCuenta;
        Saldo = cant;
        nomCliente = nCliente;

    }

}
