package Ejercicio4;
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor sin parámetros (da valores por defecto)
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    // Constructor con parámetros (recibe valores para cada atributo)
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Metodo que muestra la información del libro
    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

}
