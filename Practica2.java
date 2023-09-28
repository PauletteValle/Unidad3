/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 20000.0;
        //Saldo inicial

        System.out.println("Seleccione una opcion");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar dinero");
        System.out.println("3 - Retirar dinero");
        System.out.println("4 - Salir");

        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Saldo actual: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la catidad a depositar: $");
                double deposito = input.nextDouble();
                saldo += deposito;

                System.out.println("Depesito exitoso.Saldo actual: $" + saldo);
                break;
            case 3:
                System.out.println("Ingrese la catidad a retirar: $");
                double retiro = input.nextDouble();

                if (retiro <= saldo) {
                    saldo -= retiro;

                    System.out.println("Retiro exitoso.Saldo actual: $" + saldo);
                } else {
                    System.out.println("Saldo insuficiente");

                }
                break;
            case 4:
                System.out.println("Gracias por utilizar el cajero automatico");
                System.exit(0);
                break;

            default:

                System.out.println("Opcion no valida.Intente de nuevo");
                break;
        }
    }
}
