package TP04AlgoritmosSecuenciales;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        /* Creación de Scanner */
        Scanner sc = new Scanner(System.in);

        // Inicialización y declaración de variables
        double resultadoDistancia, x1, x2, y1, y2;

        // Ingreso y lectura de valores
        System.out.print("Ingrese el valor de x1: ");
        x1 = sc.nextInt();
        System.out.print("Ingrese el valor de y1: ");
        y1 = sc.nextInt();
        System.out.println(" ");
        System.out.print("Ingrese el valor de x2: ");
        x2 = sc.nextInt();
        System.out.print("Ingrese el valor de y2: ");
        y2 = sc.nextInt();

        // Cálculo de la distancia entre puntos
        resultadoDistancia = Math.sqrt(Math.pow(x1 - x2, 2) - Math.pow(y1 - y2, 2));

        // Muestro el resultado
        System.out.println("La distancia entre los puntos A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + ") es: " + resultadoDistancia);
    }
}
