package TP04AlgoritmosSecuenciales;

import java.util.Scanner;

public class Edulcorante {
    public static void main(String[] args) {
        /* Creación de Scanner */
        Scanner sc = new Scanner(System.in);

        // Inicialización y declaración de variables
        int gotas, tazas;

        /* Ingreso y lectura de valores */
        System.out.print("Ingrese la cantidad de tazas: ");
        tazas = sc.nextInt();

        // Cálculo de proporciones
        tazas = tazas * 2;
        gotas = tazas * 4;
        gotas = gotas * 2;

        // Muestro por pantalla
        System.out.println("Para preparar: " + tazas);
        System.out.println("Cantidad de gotas necesarias: " + gotas);
    }
}
