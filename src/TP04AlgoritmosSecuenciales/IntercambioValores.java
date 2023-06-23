package TP04AlgoritmosSecuenciales;

import java.util.Scanner;

public class IntercambioValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        /* Ingreso y lectura de valores */
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextInt();

        // Intercambio los valores sin variable auxiliar
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Ahora el valor para a es: " + a);
        System.out.println("Ahora el valor para b es: " + b);
    }
}
