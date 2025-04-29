public class Persona {
    //Atributos
    String nombre;
    String profession;
    int edad;
    String hobby;

    //Creación del metodo con parametros
    public void  presentarPersona( String nombre, String profession , int edad , String hobby){
        //Hacemos que la persona se presente
        System.out.println("Hola mi nombre es: " + nombre);
        System.out.println("Mi profesión es: "+ profession);
        System.out.println("Mi edad es: "+ edad);
        System.out.println("Mi hobby es: "+ hobby);
        System.out.println("---------------------------------------");

    }
}
