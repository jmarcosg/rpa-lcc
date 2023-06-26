package Simulacro;

import java.util.Scanner;

public class Juguetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantJuguetes, totalJuguetes;

        System.out.print("Ingrese la cantidad de juguetes por caja: ");
        cantJuguetes = sc.nextInt();

        totalJuguetes = calcularTotalJuguetes(cantJuguetes);

        System.out.println("En total hay " + totalJuguetes + " juguetes. Hay " + cantJuguetes + " por caja.");
    }

    public static int calcularTotalJuguetes(int cantJuguetes) {
        int cantPilas = 5, cantCajas = 3, total = 0;

        for (int i = 0; i < cantPilas; i++) {
            for (int j = 0; j < cantCajas; j++) {
                total += cantJuguetes;
            }
        }

        return total;
    }
}
