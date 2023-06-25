package TPModularidad;

import java.util.Scanner;

public class VehiculoAntiguo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modeloVehiculo1, modeloVehiculo2;
        String mensajeResultado;

        System.out.print("Ingrese el modelo del primer vehículo: ");
        modeloVehiculo1 = sc.nextInt();
        System.out.print("Ingrese el modelo del segundo vehículo: ");
        modeloVehiculo2 = sc.nextInt();

        mensajeResultado = calcularVehiculoMasAntiguo(modeloVehiculo1, modeloVehiculo2);

        System.out.println(mensajeResultado);
    }

    public static String calcularVehiculoMasAntiguo(int modeloVehiculo1, int modeloVehiculo2) {
        String mensaje;

        if (modeloVehiculo1 < modeloVehiculo2) {
            mensaje = "El primer vehículo es más antiguo que el segundo";
        } else if (modeloVehiculo2 < modeloVehiculo1) {
            mensaje = "El segundo vehículo es más antiguo que el primero";
        } else {
            mensaje = "Ambos vehículos son del mismo año";
        }

        return mensaje;
    }
}
