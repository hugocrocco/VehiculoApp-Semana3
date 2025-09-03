import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoSemana3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =======================
        // 1. REGISTRO DE USUARIO
        // =======================
        System.out.println("=== Registro de Usuario ===");

        // El programa solicita el nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // El programa valida que la edad esté entre 1 y 99 años
        int edad = -1;
        while (edad <= 0 || edad > 99) {
            try {
                System.out.print("Ingrese su edad: ");
                edad = sc.nextInt();
                sc.nextLine();

                if (edad <= 0 || edad > 99) {
                    System.out.println("La edad debe estar entre 1 y 99 años.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
            }
        }

        // El programa muestra el nombre y la edad ingresada
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad + " años");
        System.out.println("-----------------------------------");

        // =======================
        // 2. REGISTRO DE VEHÍCULO
        // =======================
        System.out.println("=== Registro de Vehículo ===");

        // El programa solicita la marca del vehículo
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        // El programa solicita el modelo del vehículo
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        // El programa valida que la cilindrada sea mayor que 0
        int cilindrada = -1;
        while (cilindrada <= 0) {
            try {
                System.out.print("Ingrese la cilindrada (ej: 1600): ");
                cilindrada = sc.nextInt();
                sc.nextLine();

                if (cilindrada <= 0) {
                    System.out.println("La cilindrada debe ser un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
            }
        }

        // El programa solicita el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        // El programa valida que la capacidad de pasajeros sea mayor que 0
        int capacidad = 0;
        while (capacidad <= 0) {
            try {
                System.out.print("Ingrese la capacidad de pasajeros: ");
                capacidad = sc.nextInt();

                if (capacidad <= 0) {
                    System.out.println("La capacidad debe ser al menos 1 pasajero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
            }
        }

        // El programa muestra el resumen del vehículo
        System.out.println("\n--- Resumen del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Combustible: " + combustible);
        System.out.println("Capacidad: " + capacidad + " pasajeros");
        System.out.println("-----------------------------------");

        // =======================
        // 3. CÁLCULO DE DESPACHO
        // =======================
        System.out.println("=== Cálculo de Despacho ===");

        // El programa valida que el monto no sea negativo
        int monto = -1;
        while (monto < 0) {
            try {
                System.out.print("Ingrese el monto de la compra: ");
                monto = sc.nextInt();

                if (monto < 0) {
                    System.out.println("El monto no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
            }
        }

        // El programa valida que la distancia sea mayor que 0
        int distancia = 0;
        while (distancia <= 0) {
            try {
                System.out.print("Ingrese la distancia en km: ");
                distancia = sc.nextInt();

                if (distancia <= 0) {
                    System.out.println("La distancia debe ser mayor a 0 km.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
            }
        }

        // El programa calcula el costo de despacho
        int costoDespacho;
        if (monto >= 50000) {
            costoDespacho = 0;
        } else if (monto >= 25000) {
            costoDespacho = distancia * 150;
        } else {
            costoDespacho = distancia * 300;
        }

        // El programa muestra el resumen del despacho
        System.out.println("\n--- Resumen de Despacho ---");
        System.out.println("Monto de la compra: $" + monto);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Costo de despacho: $" + costoDespacho);

        sc.close();
    }
}
