package TPRepetitivas;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        if (esCapicua(numero)) {
            System.out.println(numero + " es capicúa.");
        } else {
            System.out.println(numero + " no es capicúa.");
        }
    }

    public static boolean esCapicua(int num) {
        int numeroOriginal = num;
        int cantidadDigitos = contarDigitos(num);

        while (num >= cantidadDigitos) {
            int primerDigito = obtenerPrimerDigito(num);
            int ultimoDigito = obtenerUltimoDigito(num);
            if (primerDigito != ultimoDigito) {
                return false;
            }
            num = sacarPrimerYUltimoDigito(num);
        }
        return num == numeroOriginal;
    }

    public static int obtenerPrimerDigito(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    public static int obtenerUltimoDigito(int num) {
        return num % 10;
    }

    public static int sacarPrimerYUltimoDigito(int num) {
        return num / 10 % (int) Math.pow(10, (int) Math.log10(num) - 1);
    }

    public static int contarDigitos(int n)
    {
        String str = Integer.toString(n);

        return str.length();
    }

}
