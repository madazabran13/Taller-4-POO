/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class PruebaRectangulo {
    
    public static void main(String[] args) {
        Scanner rect = new Scanner(System.in);
        Ejercicio1.Rectangulo r; // Se define la variable del objeto
        r = new Ejercicio1.Rectangulo(); // Se instancia el objeto
        System.out.println("\t*//MEDIDAS DE UN RECTANGULO//*\n");
        System.out.print("Ingrese la longitud: ");
        double L = rect.nextDouble();
        System.out.print("Ingrese el ancho: ");
        double A = rect.nextDouble();
        
        //cambia de estado 
        r.setAncho(A);
        r.setLongitud(L);
        System.out.println(" ");
        System.out.printf("La longitud es: %.2f u\n", r.getLongitud());
        System.out.printf("El ancho es: %.2f u\n", r.getAncho());
        System.out.printf("El area del rectangulo es: %.2f u^2\n", r.calcularArea());
        System.out.printf("El perimetro del rectangulo es: %.2f u\n", r.calcularPerimetro());

    }
}
