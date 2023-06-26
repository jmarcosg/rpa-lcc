package TPRepetitivas;

import java.util.Scanner;

public class RallyMundial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantTramos;
        String resultado;

        do {
            System.out.print("Ingrese la cantidad de tramos: ");
            cantTramos = sc.nextInt();
        } while (cantTramos < 0 || cantTramos > 25);

        resultado = calcularGanadorCarrera(cantTramos);

        System.out.println(resultado);
    }

    public static String calcularGanadorCarrera(int cantTramos) {
        Scanner sc = new Scanner(System.in);
        int cantPilotos, numeroAuto, numeroAutoGanador = 0, tiempoUtilizadoEnSegs, tiempoGanador = Integer.MAX_VALUE, tramo = 1;
        String respuesta, tiempoConvertido;

        do {
            System.out.print("Ingrese la cantidad de pilotos de este tramo: ");
            cantPilotos = sc.nextInt();

            if (cantPilotos > 0) {
                System.out.println("---- Inicio tramo " + tramo + " ----");

                // Solicito los datos de los pilotos para el tramo actual
                for (int i = 1; i <= cantPilotos; i++) {
                    System.out.print("Ingrese el número del auto del piloto " + i + ": ");
                    numeroAuto = sc.nextInt();
                    System.out.print("Ingrese el tiempo utilizado en segundos: ");
                    tiempoUtilizadoEnSegs = sc.nextInt();

                    if (numeroAuto > 0 && tiempoUtilizadoEnSegs > 0) {
                        if (tramo == 1 && tiempoUtilizadoEnSegs < tiempoGanador) { // Si es el tramo 1, reemplazo el valor del tiempoGanador
                            tiempoGanador = tiempoUtilizadoEnSegs;
                            numeroAutoGanador = numeroAuto;
                        } else if (tramo > 1 && tiempoUtilizadoEnSegs < tiempoGanador) { // Sino, le sumo para el total
                            tiempoGanador += tiempoUtilizadoEnSegs;
                            numeroAutoGanador = numeroAuto;
                        }
                    }
                }
                System.out.println("---- Fin tramo " + tramo + " ----");
                tramo++;
            } else {
                System.out.println("La cantidad de pilotos no puede ser menor o igual a 0!");
            }
        } while (tramo <= cantTramos);

        tiempoConvertido = convertirTiempo(tiempoGanador);
        respuesta = "El auto número " + numeroAutoGanador + " ganó la carrera en: " + tiempoConvertido;

        return respuesta;
    }

    public static String convertirTiempo(int segundosTotales) {
        int horas, minutos, segundos;
        String resultado;

        System.out.println(segundosTotales);

        horas = segundosTotales / 3600; // Obtiene la cantidad de horas
        minutos = (segundosTotales % 3600) / 60; // Obtiene la cantidad de minutos
        segundos = (segundosTotales % 3600) % 60; // Obtiene la cantidad de segundos restantes

        resultado = horas + ":" + minutos + ":" + segundos;

        return resultado;
    }
}
