/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       
       int num1;
       int num2;
       int opc;
       String decide = "";
       
       //valida 2 num positivos enteros
       do {
           System.out.println("Introduzca el primer número");
           num1 = leer.nextInt();
           System.out.println("Introduzca el segundo número");
           num2 = leer.nextInt();
            if (num1<0 || num2<0)
            {System.out.println("Error, los números deben ser positivos enteros\n");}
       }
       while(num1<0 || num2<0);
       
       //se arma el menú
       
       do
       {
        System.out.println("\nMENU \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \nElija opción:");
        
        opc = leer.nextInt();
        
        switch(opc)
        {
            case 1:
                System.out.println("La suma de los números es = " + (num1 + num2));
            break;
            
            case 2:
                System.out.println("La resta de los números es = " + (num1 - num2));
            break;
            
            case 3:
                System.out.println("La multiplicación de los números es = " + (num1*num2));
            break;
            
            case 4: 
                System.out.println("La división de los números es = " + (num1/num2));
            break;
            
            case 5:
                System.out.println("Está seguro que desea salir del programa? (S/N)");
                decide = leer.next();
            break;
            
            default: 
                System.out.println("Ha ingresado una opción incorrecta");
            
        }
        
       }
        
        while (opc==1||opc==2||opc==3||opc==4||decide.equalsIgnoreCase("N"));
       
        
    }
    
}
