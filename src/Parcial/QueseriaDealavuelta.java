package Parcial;

import java.util.Scanner;

public class QueseriaDealavuelta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hayMasVentas, tipoVenta;
        double costoVenta, mayorVenta = 0, recaudacionTotal = 0;
        int cantVentasContado = 0;

        do {
            System.out.print("Ingrese el valor de la venta: $");
            costoVenta = sc.nextDouble();
            System.out.print("Ingrese el método de pago: ");
            tipoVenta = sc.next();

            costoVenta = calcularDescuento(costoVenta, tipoVenta);

            if (costoVenta > mayorVenta) {
                mayorVenta = costoVenta;
            }

            recaudacionTotal += costoVenta;

            if (tipoVenta.equalsIgnoreCase("contado")) {
                cantVentasContado++;
            }

            System.out.print("Desea realizar otra venta? (n para parar): ");
            hayMasVentas = sc.next();
        } while (hayMasVentas.equalsIgnoreCase("si"));

        System.out.println("Mayor venta: $" + mayorVenta);
        System.out.println("Cantidad de ventas pagando al contado: " + cantVentasContado);
        System.out.println("Recaudación total: $" + recaudacionTotal);
    }

    public static double calcularDescuento(double costoVenta, String tipoVenta) {
        double precioFinal;

        if (costoVenta > 5000 && tipoVenta.equalsIgnoreCase("contado")) {
            precioFinal = costoVenta - 400;
        } else {
            precioFinal = costoVenta / 1.05;
        }

        return precioFinal;
    }
}
