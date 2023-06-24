package TPAlgoritmosSecuenciales;

import java.util.Scanner;

public class ConvertirTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundosTotales, horas, minutos, segundos;

        System.out.print("Ingrese los segundos totales: ");
        segundosTotales = sc.nextInt();

        horas = segundosTotales / 3600; // Obtiene la cantidad de horas
        minutos = (segundosTotales % 3600) / 60; // Obtiene la cantidad de minutos
        segundos = (segundosTotales % 3600) % 60; // Obtiene la cantidad de segundos restantes

        System.out.println(segundosTotales + " seg es equivalente a " + horas + " hs " + minutos + " min " + segundos + " seg");
    }
}
