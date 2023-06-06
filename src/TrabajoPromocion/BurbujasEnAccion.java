package TrabajoPromocion;

/**
 *
 * @author Diaz Amicone, Regina Antonella
 * @author Gonzalez, Juan Marcos
 * @author Granchelli, Florencia
 */
public class BurbujasEnAccion {
    public static void main(String[] args) {
        // Declaración y asignación de variables
        int cantJugadores = 2, resultadoUsuario1 = 0, resultadoUsuario2 = 0, valorBola1, valorBola2;
        String nombreUsuario1, nombreUsuario2, colorBola1, colorBola2, mensajeResultado;
        boolean bolasMismoColor;

        // Asignación de nombre aleatorios de usuarios
        nombreUsuario1 = nombreAleatorio();
        nombreUsuario2 = nombreAleatorio();

        /*
        * Asignación de valor aleatorio para bolas de usuarios
        * Serán aleatorios en rango de 0 a 15
        */
        for (int i = 0; i <= cantJugadores; i++) {
            valorBola1 = intAleatorio(0, 15);
            valorBola2 = intAleatorio(0, 15);

            colorBola1 = colorAleatorio();
            colorBola2 = colorAleatorio();

            // Valido si los colores de las bolas son del mismo color
            bolasMismoColor = validarMismoColor(colorBola1, colorBola2);

            // Si las bolas son iguales, calculo el puntaje del usuario
            if ((bolasMismoColor) && (i == 1)) {
                resultadoUsuario1 = calcularPuntaje(valorBola1, valorBola2);
            } else if ((bolasMismoColor) && (i == 2)) {
                resultadoUsuario2 = calcularPuntaje(valorBola1, valorBola2);
            }
        }

        mensajeResultado = calcularGanador(nombreUsuario1, resultadoUsuario1, nombreUsuario2, resultadoUsuario2);

        System.out.println(mensajeResultado);
    }

    public static void asignarValores (String nombre, int valorBola1, int valorBola2) {
        nombre = nombreAleatorio();
        valorBola1 = intAleatorio(0, 15);
        valorBola2 = intAleatorio(0, 15);
    }

    public static boolean validarMismoColor(String color1, String color2) {
        // valida si dos colores son iguales
        return color1.equals(color2);
    }

    public static int calcularPuntaje(int valor1, int valor2) {
        // calcula el puntaje de un usuario
        int resultado;

        // Calculo el resultado parcial
        resultado = valor1 + valor2;

        /*
        * Reglas para puntajes
        * Si la suma de los dos valores es par, entonces suma 10 puntos extra
        * Si la suma de los dos valores es impar y menor a 10, entonces duplica su puntaje */
        if (resultado % 2 == 0) {
            resultado += 10;
        } else if ((resultado % 2 == 1) && resultado < 10) {
            resultado *= 2;
        }

        return resultado;
    }

    public static String calcularGanador(String nombreUsuario1, int resultadoUsuario1, String nombreUsuario2, int resultadoUsuario2 ) {
        // calcula quien ganó la partida
        String mensaje;

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

    public static String nombreAleatorio(){
        String arrayNombres[] = {"Anastasia", "Florencia", "Regina", "Rocío", "Agostina", "Lucía", "Rigoberto", "Juan", "Carlos", "Pedro", "Tito", "Cacho"};

        return arrayNombres[intAleatorio(0, arrayNombres.length - 1)];
    }

    public static String colorAleatorio(){
        String arrayColores[] = {"rojo", "verde", "azul", "amarillo", "celeste", "rosado"};

        return arrayColores[intAleatorio(0, arrayColores.length - 1)];
    }

}
