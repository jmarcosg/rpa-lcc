package Parcial;

import java.util.Scanner;

public class MiEscuela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantGrados = 2, cantEstudiantesPorGrado = 2, cantSillasTotales = 0, cantFamiliaresEstudiante, cantFamiliaresPorGrado;

        for (int i = 1; i <= cantGrados; i++) {
            cantFamiliaresPorGrado = 0;
            for (int j = 1; j <= cantEstudiantesPorGrado; j++) {
                System.out.print("Cuantos familiares del alumno " + j + " van a asistir?: ");
                cantFamiliaresEstudiante = sc.nextInt();

                cantSillasTotales += cantFamiliaresEstudiante;
                cantFamiliaresPorGrado += cantFamiliaresEstudiante;
            }
            System.out.println("Cantidad de familiares en el grado " + i + ": " + cantFamiliaresPorGrado);
        }

        System.out.println("Cantidad de sillas totales: " + cantSillasTotales);
    }
}
