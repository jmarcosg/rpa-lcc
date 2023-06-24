package TPAlgoritmosSecuenciales;

import java.util.Scanner;

public class QuinielaNacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSorteado, ultimoDigito, ultimosDosDigitos, ultimosTresDigitos;

        System.out.print("Ingrese el número sorteado: ");
        numeroSorteado = sc.nextInt();

        // Obtener el último dígito
        ultimoDigito = numeroSorteado % 10;
        System.out.println("Ganador a 1 dígito: " + ultimoDigito);

        // Obtener los últimos dos dígitos
        ultimosDosDigitos = numeroSorteado % 100;
        System.out.println("Ganador a 2 dígitos: " + ultimosDosDigitos);

        // Obtener los últimos tres dígitos
        ultimosTresDigitos = numeroSorteado % 1000;
        System.out.println("Ganador a 3 dígitos: " + ultimosTresDigitos);

        // El número sorteado ya es el ganador a 4 dígitos
        System.out.println("Ganador a 4 dígitos: " + numeroSorteado);
    }
}
