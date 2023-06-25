package TPModularidad;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        int porcentajeDescuento;
        double precio;
        String articulo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el artículo: ");
        articulo = sc.next();
        System.out.print("Ingrese el precio del artículo: $");
        precio = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        porcentajeDescuento = sc.nextInt();

        System.out.println("----");
        System.out.println(articulo + " sin descuento cuesta $" + precio);
        precio = calcularDescuento(precio, porcentajeDescuento);
        System.out.println(articulo + " con descuento de " + porcentajeDescuento + "% cuesta $" + precio);
    }

    public static double calcularDescuento (double unPrecio, int unDescuento) {
        double totalConDescuento;

        totalConDescuento = (unDescuento * unPrecio) / 100;
        totalConDescuento = unPrecio - totalConDescuento;

        return totalConDescuento;
    }
}
