/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner prod = new Scanner(System.in);
        Ejercicio5.Principal r; // Se define la variable del objeto
        r = new Ejercicio5.Principal(); // Se instancia el objeto
        
        System.out.println("\t PRODUCTOS DE TIENDA \n");
        System.out.print("Codigo: ");
        int c = prod.nextInt();
        System.out.print("Nombre: ");
        String n = prod.next();
        System.out.print("Precio de compra: ");
        double pc = prod.nextDouble();
        System.out.print("Precio de publico: ");
        double pp = prod.nextDouble();
        System.out.print("Porcentaje de utlidad: ");
        double pu = prod.nextDouble();
        
        //cambia de estado 
       
    }

    
}
