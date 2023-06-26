package Simulacro;

import java.util.Scanner;

public class PizzaPorMetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantMetros, pizzaMasGrande = 0;
        double recaudacionTotal = 0, precioVenta;
        String tipoPizza, respuesta;
        boolean finPrograma = false, valoresCorrectos;

        do {
            System.out.print("Ingrese la cantidad de metros: ");
            cantMetros = sc.nextInt();
            System.out.print("Ingrese el tipo de pizza (especial / normal): ");
            tipoPizza = sc.next();

            valoresCorrectos = validarValores(cantMetros, tipoPizza);

            if (valoresCorrectos) {
                precioVenta = calcularPrecioPizza(tipoPizza, cantMetros);
                recaudacionTotal = acumularRecaudacion(recaudacionTotal, precioVenta);
                pizzaMasGrande = calcularPizzaMasGrande(pizzaMasGrande, cantMetros);

                System.out.print("Desea realizar otra venta? (s / n): ");
                respuesta = sc.next();
                if (respuesta.equals("n")) {
                    finPrograma = true;
                }
            } else {
                System.out.println("Valores incorrectos");
            }
        } while (!finPrograma);

        System.out.println("Total del día: $" + recaudacionTotal);
        System.out.println("Pizza más grande del día: " + pizzaMasGrande + "m");
    }

    public static boolean validarValores(int cantMetros, String tipoPizza) {
        boolean validados = false;

        if (cantMetros > 0) {
            if (tipoPizza.equals("especial") || tipoPizza.equals("normal")) {
                validados = true;
            }
        }

        return validados;
    }

    public static double calcularPrecioPizza(String tipoPizza, int cantMetros) {
        int precioPizzaEspecial = 1500, precioPizzaNormal = 1200, total;

        if (tipoPizza.equals("especial")) {
            total = cantMetros * precioPizzaEspecial;
        } else {
            total = cantMetros * precioPizzaNormal;
        }

        return total;
    }

    public static double acumularRecaudacion(double recaudacionTotal, double precioVenta) {
        return recaudacionTotal + precioVenta;
    }

    public static int calcularPizzaMasGrande(int pizzaMasGrande, int cantMetros) {
        if (cantMetros > pizzaMasGrande) {
            pizzaMasGrande = cantMetros;
        }

        return pizzaMasGrande;
    }
}
