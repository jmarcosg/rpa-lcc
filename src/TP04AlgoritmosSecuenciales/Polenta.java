package TP04AlgoritmosSecuenciales;

import java.util.Scanner;

public class Polenta {
    public static void main(String[] args) {
        /* Creación de Scanner */
        Scanner sc = new Scanner(System.in);

        // Inicialización y declaración de variables
        int cantTazasDeAguaBase = 3, cantTazasDeAgua = 0, cantCubitosDeCaldoBase = 2, cantCubitosDeCaldo = 0, cantTazasDePolentaBase = 1, cantTazasDePolenta = 0, cantPorcionesPolenta = 0;

        /* Ingreso y lectura de valores */
        System.out.print("Ingrese la cantidad porciones de polenta a hacer: ");
        cantPorcionesPolenta = sc.nextInt();

        // Cálculo de proporciones
        cantTazasDeAgua = cantTazasDeAguaBase * cantPorcionesPolenta;
        cantCubitosDeCaldo = cantCubitosDeCaldoBase * cantPorcionesPolenta;
        cantTazasDePolenta = cantTazasDePolentaBase * cantPorcionesPolenta;

        /* Muestro el resultado por pantalla */
        System.out.println("Para preparar " + cantPorcionesPolenta + " porciones de polenta se necesita:");
        System.out.println(" ");
        System.out.println("- " + cantTazasDeAgua + " tazas de agua.");
        System.out.println("- " + cantCubitosDeCaldo + " cubitos de caldo.");
        System.out.println("- " + cantTazasDePolenta + " tazas de polenta");
    }
}
