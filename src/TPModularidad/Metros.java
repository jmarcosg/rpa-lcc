package TPModularidad;

import java.util.Scanner;

public class Metros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centimetros, metros;

        System.out.print("Ingrese los centímetros a convertir: ");
        centimetros = sc.nextDouble();

        metros = calcularMetros(centimetros);

        System.out.println(centimetros + "cm equivalen a " + metros + "m");
    }

    public static double calcularMetros(double centimetros) {
        double resultado;

        resultado = centimetros / 100;

        return resultado;
    }
}
