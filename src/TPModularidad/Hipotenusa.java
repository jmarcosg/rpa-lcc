package TPModularidad;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        double base, altura, hipotenusa;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        base = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        hipotenusa = calcularHipotenusa(base, altura);

        System.out.println("La hipotenusa es: " + hipotenusa);
    }

    public static double calcularHipotenusa(double base, double altura) {
        double resultado;

        resultado = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        return resultado;
    }
}
