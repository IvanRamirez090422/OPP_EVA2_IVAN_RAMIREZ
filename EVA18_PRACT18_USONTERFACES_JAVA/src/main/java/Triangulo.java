/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Triangulo implements Figuras, MostrarDatos {

    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPeri() {

        double hip = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + (hip);
    }

    public void imprimirDatos() {
        
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
        System.out.println();
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPeri());
    }

}
