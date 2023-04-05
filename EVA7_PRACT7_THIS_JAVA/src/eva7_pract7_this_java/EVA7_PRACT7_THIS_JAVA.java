/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva7_pract7_this_java;

/**
 *
 * @author user
 */
public class EVA7_PRACT7_THIS_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereClass

        class Persona {

            private String nombre;
            private String apellido;
            //THIS: invocar cualquier atributo, metodos, referencia a una instancia de una clase 
            //EXISTE en todas las clases
            //THIS NO FUNCIONA en contextos estaticos
            public Persona(String nombre, String apellido) {
                this.nombre = nombre;
                this.apellido = apellido;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

        }
    }

}
