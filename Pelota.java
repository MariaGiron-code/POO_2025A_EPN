package Ejercicio3;
public class Pelota {
        // Atributos
        private String color;
        private String tamaño;

        // Constructor
        public Pelota(String color, String tamaño) {
            this.color = color;
            this.tamaño = tamaño;
        }

        // Metodo para mostrar los detalles de la pelota
        public void mostrarDetalles() {
            System.out.println("Color: " + color + ", Tamaño: " + tamaño);
        }

}
