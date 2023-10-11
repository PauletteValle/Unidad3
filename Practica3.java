/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;
/**
 *
 * @author moram
 */
public class Practica3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros de laserie Fibonacci");
        
        int n = input.nextInt();
        int[] fibonacci = new int [n];
        
        fibonacci [0] = 0;
        fibonacci [1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("La serie Fibonacci es de " + n + "numeros:");
        
        for(int i = 0; i < n; i++){
            System.out.println(fibonacci[1] + "  ");
        }
        
    }
}
