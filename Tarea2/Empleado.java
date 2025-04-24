package Tarea2;
import java.util.Scanner;

public class Empleado {
    // Atributos de la clase principal
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    // Méodo para mostrar la información
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        // Pedir datos de los empleados
        for (int i = 0; i < 2; i++) {
            empleados[i] = new Empleado();

            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            empleados[i].nombre = sc.nextLine();

            System.out.print("Cargo: ");
            empleados[i].cargo = sc.nextLine();

            System.out.print("Salario: ");
            empleados[i].salario = sc.nextDouble();

            sc.nextLine(); // Consumir el salto de línea buffer

            System.out.print("Fecha de Ingreso: ");
            empleados[i].fechaIngreso = sc.nextLine();
        }

        System.out.println("\nInformación de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }

        sc.close();
    }
}