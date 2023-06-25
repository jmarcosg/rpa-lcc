package TPModularidad;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        String mensaje;

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextDouble();

        mensaje = calcularMayor(numero1, numero2);

        System.out.println(mensaje);
    }

    public static String calcularMayor(double num1, double num2) {
        String mensajeResultado;

        if (num1 > num2) {
            mensajeResultado = num1 + " es mayor que " + num2;
        } else if (num2 > num1) {
            mensajeResultado = num2 + " es mayor que " + num1;
        } else {
            mensajeResultado = "Los números son iguales";
        }

        return mensajeResultado;
    }
}
