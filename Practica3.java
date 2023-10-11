/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;
/**
 *
 * @author moram
 */
public class FibonacciPractica3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros de la serie Fibonacci:");
        
        int n = input.nextInt();
        int a = 0, b = 1;
        
        System.out.println("La serie Fibonacci es " + n + "numeros: " + a + " " + b);
        
        for(int i = 2; i < n; i++){
            int c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
        
    }
}
