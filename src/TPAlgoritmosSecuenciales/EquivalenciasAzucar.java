package TPAlgoritmosSecuenciales;

import java.util.Scanner;

public class EquivalenciasAzucar {
    public static void main(String[] args) {
        /* Creación de Scanner */
        Scanner sc = new Scanner(System.in);

        // Inicialización y declaración de variables
        double tazaG, tazaP, cucharaG, cucharaP, grAzucar;

        // Ingreso y lectura de valores
        System.out.print("Ingrese los gramos de azucar: ");
        grAzucar = sc.nextDouble();

        // Cálculo de equivalencias
        tazaG = grAzucar / 18;
        tazaP = grAzucar * 7;
        cucharaG = grAzucar / 18;
        cucharaP = grAzucar / 120;

        // Muestro las equivalencias por pantalla
        System.out.println(grAzucar + "gr de azucar equivalen a:");
        System.out.println(tazaG + " taza(s) grande(s)");
        System.out.println(tazaP + " taza(s) pequeña(s)");
        System.out.println(cucharaG + " cuchara(s) grande(s)");
        System.out.println(cucharaP + " cuchara(s) pequeña(s)");

    }
}
