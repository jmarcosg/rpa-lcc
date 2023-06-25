package TPRepetitivas;

import java.util.Scanner;

public class BienvenidaMarciana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saludo = "Bienvenidos, colonizadores galácticos", respuesta;
        boolean ordenAlto = false;

        while (!ordenAlto) {
            System.out.println(saludo);

            System.out.print("Desea que los esclavos continuen saludando? (si/no): ");
            respuesta = sc.next();

            if(respuesta.equals("no")) {
                ordenAlto = true;
            }
        }

    }
}
