package Tarea2;
import java.util.Scanner;

public class Jugador {
        // Atributos del jugador
        private String nombre;
        private String posicion;
        private int edad;
        private int numeroCamiseta;

        // Constructor
        public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
                this.nombre = nombre;
                this.posicion = posicion;
                this.edad = edad;
                this.numeroCamiseta = numeroCamiseta;
        }

        // Metodo para mostrar la información del jugador
        public void mostrarInfo() {
                System.out.println("Nombre: " + nombre);
                System.out.println("Posición: " + posicion);
                System.out.println("Edad: " + edad);
                System.out.println("Número de camiseta: " + numeroCamiseta);
        }
        //hhhhhhhhhhhhh
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Pedir datos al usuario
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Posición: ");
                String posicion = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();

                System.out.print("Número de camiseta: ");
                int numeroCamiseta = sc.nextInt();

                // Crear el jugador
                Jugador jugadorUsuario = new Jugador(nombre, posicion, edad, numeroCamiseta);

                jugadorUsuario.mostrarInfo();

                sc.close();
        }
}

