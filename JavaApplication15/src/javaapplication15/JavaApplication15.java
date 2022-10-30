/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner samus = new Scanner(System.in);
      int a,b,c=0;
        do{
         System.out.println("*********** Calculadora Cientifica LUFU ***********");
         System.out.println("Ejercicio 1");
         System.out.println("Ejercicio 2 ");
         System.out.println("Ejercicio 3 ");
       
         System.out.println("***********                            ***********");
         System.out.println("");
         System.out.print("Ingresa tu Opcion a elegir:  ");
         a = samus.nextInt();
         System.out.println(" ");
         switch(a){
             case 1:
                 System.out.println("Ingresa El primer");
                 b = samus.nextInt();
                  System.out.println("Ingresa El segundo");
                 c = samus.nextInt();
                 if(b>c){
                     System.out.println("El primero numero es el mayor:" + b);
                 }else{
                     System.out.println("El segundo numero es el mayor:" + c);
                 }
                 break;
             case 2:
                 System.out.println("Ingresa el numero de tu piramide:");
                 int fila = samus.nextInt();
                 
                 for (int alto = 1; alto <= fila; alto++) {
                     //
                     for (int espacio = 1; espacio <= fila-alto; espacio++) {
                         System.out.print(" ");
                     }
                     for (int asteriscos = 1; asteriscos <= (alto*2)-1; asteriscos++) {
                         System.out.print("*");
                     }
                     System.out.println();
                 }
                
                 break;
             case 3:
               
                 break;
           case 4:
              System.exit(0);
           break;
             default:
                 System.out.println("Ingresa una opcion valida");
                 break;
         }
     }while(a!=4);
    }
    }
    

