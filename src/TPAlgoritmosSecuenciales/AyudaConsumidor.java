package TPAlgoritmosSecuenciales;

import java.util.Scanner;

public class AyudaConsumidor {
    public static void main(String[] args) {
        double cantidadProducto1, cantidadProducto2, precioProducto1, precioProducto2, costoPorUnidad1, costoPorUnidad2;
        boolean producto1EsMasEconomico, producto2EsMasEconomico;
        Scanner sc = new Scanner(System.in);

        // Leer los datos del producto uno
        System.out.print("Ingrese el precio del producto uno: $");
        precioProducto1 = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto uno:");
        cantidadProducto1 = sc.nextDouble();

        // Leer los datos del producto dos
        System.out.print("Ingrese el precio del producto dos: $");
        precioProducto2 = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto dos:");
        cantidadProducto2 = sc.nextDouble();

        // Calcular el costo por unidad de cada producto
        costoPorUnidad1 = precioProducto1 / cantidadProducto1;
        costoPorUnidad2 = precioProducto2 / cantidadProducto2;

        // Determinar cuál producto es más económico
        producto1EsMasEconomico = costoPorUnidad1 < costoPorUnidad2;
        producto2EsMasEconomico = costoPorUnidad2 < costoPorUnidad1;

        // Mostrar el resultado
        System.out.println("El producto uno es más económico: " + producto1EsMasEconomico);
        System.out.println("El producto dos es más económico: " + producto2EsMasEconomico);
    }
}
