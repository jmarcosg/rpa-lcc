package TrabajoPromocion;

import java.util.Scanner;

public class BurbujasEnAccion {
    public static void main(String[] args) {
        // Creo a Scanner
        Scanner sc = new Scanner(System.in);

        // Declaración y asignación de variables
        int resultadoUsuario1 = 0, resultadoUsuario2 = 0, valorBola1Usuario1 = 0, valorBola2Usuario1 = 0, valorBola1Usuario2 = 0, valorBola2Usuario2 = 0;
        String nombreUsuario1, nombreUsuario2, colorBola1Usuario1, colorBola2Usuario1, colorBola1Usuario2, colorBola2Usuario2, mensajeResultado;
        boolean bolasMismoColorUsuario1, bolasMismoColorUsuario2;

        // Ingreso y lectura de valores
        System.out.print("Ingrese el nombre del usuario 1: ");
        nombreUsuario1 = sc.next();
        System.out.print("Ingrese el nombre del usuario 2: ");
        nombreUsuario2 = sc.next();

        System.out.println(" ");

        System.out.print("Ingrese el valor de la bola 1 para " + nombreUsuario1 + ": ");
        valorBola1Usuario1 = sc.nextInt();
        System.out.print("Ingrese el color de la bola 1 para " + nombreUsuario1 + ": ");
        colorBola1Usuario1 = sc.next();
        System.out.print("Ingrese el valor de la bola 2 para " + nombreUsuario1 + ": ");
        valorBola2Usuario1 = sc.nextInt();
        System.out.print("Ingrese el color de la bola 2 para " + nombreUsuario1 + ": ");
        colorBola2Usuario1 = sc.next();


        System.out.println(" ");

        System.out.print("Ingrese el valor de la bola 1 para " + nombreUsuario2 + ": ");
        valorBola1Usuario2 = sc.nextInt();
        System.out.print("Ingrese el color de la bola 1 para " + nombreUsuario2 + ": ");
        colorBola1Usuario2 = sc.next();
        System.out.print("Ingrese el valor de la bola 2 para " + nombreUsuario2 + ": ");
        valorBola2Usuario2 = sc.nextInt();
        System.out.print("Ingrese el color de la bola 2 para " + nombreUsuario2 + ": ");
        colorBola2Usuario2 = sc.next();



        bolasMismoColorUsuario1 = validarMismoColor(colorBola1Usuario1, colorBola2Usuario1);
        bolasMismoColorUsuario2 = validarMismoColor(colorBola1Usuario2, colorBola2Usuario2);

        if (bolasMismoColorUsuario1) {
            resultadoUsuario1 = calcularPuntaje(valorBola1Usuario1, valorBola2Usuario1);
        }

        if (bolasMismoColorUsuario2) {
            resultadoUsuario2 = calcularPuntaje(valorBola1Usuario2, valorBola2Usuario2);
        }

        mensajeResultado = calcularGanador(nombreUsuario1, resultadoUsuario1, nombreUsuario2, resultadoUsuario2);

        System.out.println(mensajeResultado);
    }

    public static boolean validarMismoColor(String color1, String color2) {
        boolean resultado = false;

        if (color1.equals(color2)) {
            resultado = true;
        }

        return resultado;
    }

    public static int calcularPuntaje(int valor1, int valor2) {
        int resultado;

        resultado = valor1 + valor2;

        return resultado;
    }

    public static String calcularGanador(String nombreUsuario1, int resultadoUsuario1, String nombreUsuario2, int resultadoUsuario2 ) {
        String mensaje = "";

        if (resultadoUsuario1 > resultadoUsuario2) {
            mensaje = nombreUsuario1 + " le ganó a " + nombreUsuario2 + " " + resultadoUsuario1 + " a " + resultadoUsuario2 + ".";
        } else if (resultadoUsuario2 > resultadoUsuario1) {
            mensaje = nombreUsuario2 + " le ganó a " + nombreUsuario1 + " " + resultadoUsuario2 + " a " + resultadoUsuario1 + ".";
        } else {
            mensaje = nombreUsuario1 + " empató con " + nombreUsuario2 + " " + resultadoUsuario1 + " a " + resultadoUsuario2 + ".";
        }

        return mensaje;
    }

}
