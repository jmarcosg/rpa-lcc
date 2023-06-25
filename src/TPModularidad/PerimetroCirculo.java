package TPModularidad;

import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, diametro, perimetro;

        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();

        diametro = calcularDiametro(radio);
        perimetro = calcularPerimetro(diametro);

        System.out.println("Diametro del círculo: " + diametro);
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    public static double calcularDiametro(double radio) {
        double resultado;

        resultado = 2 * radio;

        return  resultado;
    }

    public static double calcularPerimetro(double diametro) {
        double resultado;

        resultado = Math.PI * diametro;

        return resultado;
    }
}
