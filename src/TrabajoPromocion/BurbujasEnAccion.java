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
        int resultadoUsuario1 = 0, resultadoUsuario2 = 0;
        String nombreUsuario1, nombreUsuario2, mensajeResultado;
        boolean esFinPartida = false;

        // Asignación de nombre aleatorios de usuarios
        nombreUsuario1 = nombreAleatorio();
        nombreUsuario2 = nombreAleatorio();

        do {
            resultadoUsuario1 = jugarBurbujas(resultadoUsuario1);
            resultadoUsuario2 = jugarBurbujas(resultadoUsuario2);

            System.out.println("res usu1: " + resultadoUsuario1);
            System.out.println("res usu2: " + resultadoUsuario2);

            System.out.println(resultadoUsuario1 % 7 == 0);
            System.out.println(resultadoUsuario2 % 7 == 0);

            if ((resultadoUsuario1 % 7 == 0 && resultadoUsuario1 != 0) || (resultadoUsuario2 % 7 == 0 && resultadoUsuario2 != 0)) {
                esFinPartida = true;
            }
        } while (!esFinPartida);

        mensajeResultado = calcularGanador(nombreUsuario1, resultadoUsuario1, nombreUsuario2, resultadoUsuario2);

        System.out.println(mensajeResultado);
    }

    public static int jugarBurbujas (int resultado) {
        int valorBola1, valorBola2;
        String colorBola1, colorBola2;
        boolean bolasMismoColor;

        valorBola1 = intAleatorio(0, 15);
        valorBola2 = intAleatorio(0, 15);

        colorBola1 = colorAleatorio();
        colorBola2 = colorAleatorio();

        bolasMismoColor = validarMismoColor(colorBola1, colorBola2);

        if (bolasMismoColor) {
            resultado = calcularPuntaje(valorBola1, valorBola2);
        }

        return resultado;
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
