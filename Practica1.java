/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;
import java.util.Scanner;
/**
 *
 * @author moram
 */
public class Practica1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame un numero entero: ");
        
       int numero = scanner.nextInt();
       
       if (numero % 2 == 0) {
           System.out.println("El numero es par");          
       }
       else { 
           System.out.println("El numero es impar");
       }    
       
       scanner.close();
    }
}
