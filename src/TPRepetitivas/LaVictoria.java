package TPRepetitivas;

import java.util.Scanner;

public class LaVictoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSerie, cantidadTripulantes;
        double porcentajeDanoEstructural, resultado;
        String respuesta;
        boolean finPrograma = false;

        while (!finPrograma) {
            System.out.print("Ingrese el numero de serie de la nave: ");
            numeroSerie = sc.nextInt();
            System.out.print("Ingrese el porcentaje de daño estructural de la nave: ");
            porcentajeDanoEstructural = sc.nextDouble();

            if (porcentajeDanoEstructural > 30) {
                System.out.print("Ingrese la cantidad de tripulantes de la nave: ");
                cantidadTripulantes = sc.nextInt();
                resultado = calcularAlgoNave(porcentajeDanoEstructural, cantidadTripulantes);
                System.out.println("Resultado: " + resultado);
                finPrograma = true;
            }
        }
    }

    public static double calcularAlgoNave(double porcentaje, int cantTripulantes) {
        return cantTripulantes * porcentaje;
    }
}
