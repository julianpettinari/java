package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Pedir el nombre de la mascota:
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar el nombre de la mascota");
        String nombreMascota = scan.nextLine();

        //Pedir cuanto come:
        System.out.println("Ingresar cuánto come su mascota");
        Double cantidadCome = scan.nextDouble();

        //Calcular cantidad de paquetes
        Integer cantidadPaquetes = cuantosPaquetesNecesito(cantidadCome);

        //Mostrar el resultado, la cantidad de paquetes que necesito para llenar a la mascota
        System.out.println("La cantidad de paquetes son:" + cantidadPaquetes);

    }
        public static int cuantosPaquetesNecesito(Double cantidadCome){
        Scanner scan = new Scanner(System.in);
        Double comidaActual = 0.0;
        Integer cantidadPaquetes = 0;

        //la mascota come 4 kg, ahora pido paquetes de un peso que no se.
        // Cuando la cantidad de paquetes mesa mas que lo que come la mascota entonces determino la cantidad de paquetes que necesito

        while (comidaActual < cantidadCome){
            System.out.println("Ingresa el peso del paquete");
            Double pesoPaquete = scan.nextDouble();
            comidaActual += pesoPaquete;
            cantidadPaquetes++;
        }
        return cantidadPaquetes;



    }
}
