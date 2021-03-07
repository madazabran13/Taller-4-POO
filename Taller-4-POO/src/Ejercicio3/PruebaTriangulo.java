/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class PruebaTriangulo {
    
   public static void main(String[] args) {
        Scanner rect = new Scanner(System.in);
        Ejercicio3.Triangulo r; // Se define la variable del objeto
        r = new Ejercicio3.Triangulo(); // Se instancia el objeto
        System.out.println("\t*//MEDIDAS DE UN TRIANGULO ISOSCELES//*\n");
        
        System.out.print("Ingrese la Altura: ");
        double a = rect.nextDouble();
        System.out.print("Ingrese la Base: ");
        double b = rect.nextDouble();
        
        //cambia de estado 
        r.setAltura(a);
        r.setBase(b);
        
        System.out.println(" ");
        System.out.printf("La Base es: %.2f u\n", r.getBase());
        System.out.printf("La Altura es: %.2f u\n", r.getAltura());
        System.out.printf("El area del rectangulo es: %.2f u^2\n", r.calcularArea());
        System.out.printf("El lado igual es: %.2f u\n", r.calcularLongitud());
        System.out.printf("El perimetro del rectangulo es: %.2f u\n", r.calcularPerimetro());

    }
}
