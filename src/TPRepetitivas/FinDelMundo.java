package TPRepetitivas;

import java.util.Scanner;

public class FinDelMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            nombre = sc.next();
            System.out.print("Ingrese el apellido del estudiante " + i + ": ");
            apellido = sc.next();
        }
    }
}
