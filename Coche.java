package Ejercicio2;
public class Coche {
    //Atributos
    String marca;
    String color;
    int anioFabricacion;
    double precio;

    //Creamos el constructor vacio
    public Coche(){

    }
    //Creamos el constructor con parametros
    public Coche(String marca, String color, int anioFabricacion, double precio){

    }
    //Creamos el metodo mostrar informacion del auto
    public void mostrarInfo(){
        System.out.println("Marca del auto: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Precio: " + precio);

    }
}
