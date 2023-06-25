package TPRepetitivas;

import java.util.Scanner;

public class NivelesRadiacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivelIngresado;

        do {
            System.out.print("Ingrese el nivel de radiación: ");
            nivelIngresado = sc.nextInt();

            if (nivelIngresado < 1 || nivelIngresado > 5000) {
                System.out.println("Valor ingresado erroneo");
            } else if (nivelIngresado >= 4000) {
                System.out.println("ALERTA!");
            } else {
                System.out.println("Todo OK!");
            }
        } while (nivelIngresado < 4000 && nivelIngresado > 0);
    }
}
