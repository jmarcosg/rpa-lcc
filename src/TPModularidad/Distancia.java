package TPModularidad;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        int velocidad, tiempo;
        double distanciaRecorrida;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la velocidad en km/h: ");
        velocidad = sc.nextInt();
        System.out.print("Ingrese el tiempo en hs: ");
        tiempo = sc.nextInt();

        distanciaRecorrida = calcularDistancia(velocidad, tiempo);

        System.out.println("Distancia recorrida: " + distanciaRecorrida + "km");
    }

    public static double calcularDistancia (int velocidad, int tiempo) {
        double resultado;

        resultado = velocidad * tiempo;

        return resultado;
    }
}
