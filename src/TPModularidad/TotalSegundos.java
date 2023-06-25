package TPModularidad;

import java.util.Scanner;

public class TotalSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, totalSegundos;

        System.out.print("Ingrese las horas: ");
        horas = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        segundos = sc.nextInt();

        totalSegundos = calcularSegundosTotales(horas, minutos, segundos);

        System.out.println("El tiempo en total en segundos es: " + totalSegundos + " segs.");
    }

    public static int calcularSegundosTotales(int horas, int minutos, int segundos) {
        int resultado;

        resultado = (horas * 3600) + (minutos * 60) + segundos;

        return resultado;
    }
}
