package TrabajoPromocion;

import java.util.Scanner;

public class BurbujasEnAccion {
    public static void main(String[] args) {
        // Creo a Scanner
        Scanner sc = new Scanner(System.in);

        // Declaración y asignación de variables
        int resultadoUsuario1 = 0, resultadoUsuario2 = 0, valorBola1Usuario1, valorBola2Usuario1, valorBola1Usuario2, valorBola2Usuario2;
        String nombreUsuario1, nombreUsuario2, colorBola1Usuario1, colorBola2Usuario1, colorBola1Usuario2, colorBola2Usuario2, mensajeResultado;
        boolean bolasMismoColorUsuario1, bolasMismoColorUsuario2;

        // Asignación de nombre aleatorios de usuarios
        nombreUsuario1 = nombreAleatorio();
        nombreUsuario2 = nombreAleatorio();

        /*
        * Asignación de valor aleatorio para bolas de usuarios
        * Serán aleatorios en rango de 0 a 15
        */
        valorBola1Usuario1 = intAleatorio(0, 15);
        valorBola2Usuario1 = intAleatorio(0, 15);
        valorBola1Usuario2 = intAleatorio(0, 15);
        valorBola2Usuario2 = intAleatorio(0, 15);

        /*
        * Asignación de color aleatorio para bolas de usuarios
        */
        colorBola1Usuario1 = colorAleatorio();
        colorBola2Usuario1 = colorAleatorio();
        colorBola1Usuario2 = colorAleatorio();
        colorBola2Usuario2 = colorAleatorio();

        // Llamo al módulo correspondiente para validar si las bolas son del mismo color
        bolasMismoColorUsuario1 = validarMismoColor(colorBola1Usuario1, colorBola2Usuario1);
        bolasMismoColorUsuario2 = validarMismoColor(colorBola1Usuario2, colorBola2Usuario2);

        // Si las bolas son iguales, calculo el puntaje del usuario
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
        return color1.equals(color2);
    }

    public static int calcularPuntaje(int valor1, int valor2) {
        return valor1 + valor2;
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

    public static double doubleAleatorio(int min, int max){
        return Math.random() * (max-min) + min;
    }

    public static int intAleatorio(int min, int max){
        return (int) doubleAleatorio(min, max);
    }

    public static char charAleatorio(){
        char a;

        if (Math.random() >= 0.5){
            // letras mayúsculas
            a = (char) intAleatorio(97, 123);
        } else {
            // letras minúsculas
            a = (char) intAleatorio(65, 91);
        }

        return a;
    }

    public static String stringAleatorio(int tam){
        String res = "";

        for(int i = 0; i < tam; i++){
            res = res + charAleatorio();
        }

        return res;
    }

    public static String nombreAleatorio(){
        // ejemplo para definir un valor aleatorio entre varias posibilidades
        // en este caso nombres
        String arrayNombres[] = {"Anastasia", "Florencia", "Regina", "Rocío", "Agostina", "Lucía", "Rigoberto", "Juan", "Carlos", "Pedro", "Tito", "Cacho"};
        return arrayNombres[intAleatorio(0, arrayNombres.length - 1)];
    }

    public static String colorAleatorio(){
        // ejemplo para definir un valor aleatorio entre varias posibilidades
        // en este caso colores
        String arrayColores[] = {"rojo", "verde", "azul", "amarillo", "celeste", "rosado"};
        return arrayColores[intAleatorio(0, arrayColores.length - 1)];
    }

}
