package TPAlgoritmosSecuenciales;

import java.util.Scanner;

public class AireAcondicionado {
    public static void main(String[] args) {
        double alto, ancho, profundidad, totalFrigorias;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la altura de la habitación: ");
        alto = sc.nextDouble();
        System.out.print("Ingrese el ancho de la habitación: ");
        ancho = sc.nextDouble();
        System.out.print("Ingrese la profundidad de la habitación: ");
        profundidad = sc.nextDouble();

        totalFrigorias = (alto * ancho) * profundidad;

        System.out.println("Se necesitan: " + totalFrigorias + " frigorías");
    }
}
