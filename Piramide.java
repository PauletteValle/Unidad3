/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piramide;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Piramide {

    public static void main(String[] args) {
        //Declarar una variable para el numero de filas 
        int numFilas;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de filas para la piramide");
        numFilas = scanner.nextInt();             
        
        for(int i = 1; i <= numFilas; i++) {
                                                             
            //Imprimir espacio vacio o asterisco 
            for(int k = 1; k <= 2 * i - 1; k++); {
            System.out.println("*");
        }
            System.out.println();
        }
            scanner.close();
            
        }
    }

