package Tarea2;

import java.util.Scanner;

public class Prueba {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese los siguientes requisitos para postular: ");
            System.out.println("Nombre y apellido, cédula, puntaje de postulación.  ");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Cédula: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Puntaje de postulación: ");
            double puntaje = sc.nextDouble();
            sc.nextLine();
            sc.close();
        }
    }

