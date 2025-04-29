package Ejercicio4;
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto usando el constructor sin parámetros
        Libro libro1 = new Libro();

        // Creación de objetos usando el constructor con parámetros
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        // Llamando al metodo normal para mostrar la información de cada libro
        libro1.imprimirInfo();
        System.out.println("------------------");
        libro2.imprimirInfo();
        System.out.println("------------------");
        libro3.imprimirInfo();
    }
}


