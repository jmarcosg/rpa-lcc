package TPModularidad;

import java.util.Scanner;

public class DNISospechoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dniIngresado, dniSospechoso = 28361924;
        String mensajeResultado;

        System.out.print("Ingrese un DNI: ");
        dniIngresado = sc.nextInt();

        mensajeResultado = verificarDNI(dniIngresado, dniSospechoso);

        System.out.println(mensajeResultado);
    }

    public static String verificarDNI(int dniIngresado, int dniSospechoso) {
        String mensaje;

        if (dniIngresado == dniSospechoso) {
            mensaje = "ALERTA!! Sospechoso encontrado!!";
        } else {
            mensaje = "No es el sospechoso. Circule!";
        }

        return mensaje;
    }
}
