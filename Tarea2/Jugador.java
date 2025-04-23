import java.util.Scanner;
public class Jugador {
        Scanner sc = new Scanner(System.in);

        // Atributos
        String nombre;
        String posicion;
        int edad;
        int numeroCamiseta;

        // Constructor
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
            this.nombre = nombre;
            this.posicion = posicion;
            this.edad = edad;
            this.numeroCamiseta = numeroCamiseta;
        }
}

