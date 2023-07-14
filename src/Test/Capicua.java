package Test;

public class Capicua {
    public static boolean esCapicua(int numero) {
        // Convertir el número a cadena para facilitar la manipulación
        String numeroStr = Integer.toString(numero);

        // Verificar si el número es capicúa recursivamente
        return esCapicuaRecursivo(numeroStr);
    }

    private static boolean esCapicuaRecursivo(String numeroStr) {
        // Caso base: si el número tiene 0 o 1 dígitos, es capicúa
        if (numeroStr.length() <= 1) {
            return true;
        }

        // Obtener la primera y última cifra del número
        int primeraCifra = obtenerPrimeraCifra(numeroStr);
        int ultimaCifra = obtenerUltimaCifra(numeroStr);

        // Verificar si la primera y última cifra son iguales
        if (primeraCifra != ultimaCifra) {
            return false;
        }

        // Recortar el número eliminando la primera y última cifra
        String numeroRecortado = recortarNumero(numeroStr);

        // Llamar recursivamente con el número recortado
        return esCapicuaRecursivo(numeroRecortado);
    }

    private static int obtenerPrimeraCifra(String numeroStr) {
        // Obtener el primer carácter y convertirlo a entero
        char primerCaracter = numeroStr.charAt(0);
        return Character.getNumericValue(primerCaracter);
    }

    private static int obtenerUltimaCifra(String numeroStr) {
        // Obtener el último carácter y convertirlo a entero
        char ultimoCaracter = numeroStr.charAt(numeroStr.length() - 1);
        return Character.getNumericValue(ultimoCaracter);
    }

    private static String recortarNumero(String numeroStr) {
        // Eliminar la primera y última cifra del número
        return numeroStr.substring(1, numeroStr.length() - 1);
    }

    public static void main(String[] args) {
        int numero = 920029;
        if (esCapicua(numero)) {
            System.out.println(numero + " es capicúa.");
        } else {
            System.out.println(numero + " no es capicúa.");
        }
    }
}
