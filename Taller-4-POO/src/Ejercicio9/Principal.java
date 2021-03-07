/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Principal {

    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);
        Ejercicio9.Fraccion r; // Se define la variable del objeto
        r = new Ejercicio9.Fraccion(); // Se instancia el objeto
        System.out.println("\t*//OPERACIONES CON FRACCIONES//*\n");

        System.out.print("Ingrese el numerador 1: ");
        int n1 = fr.nextInt();
        System.out.print("Ingrese el denominador 1: ");
        int d1 = fr.nextInt();
        System.out.print("Ingrese el numerador 2: ");
        int n2 = fr.nextInt();
        System.out.print("Ingrese el denominador 2: ");
        int d2 = fr.nextInt();

        //cambia de estado 
        r.setNumerador1(n1);
        r.setDenominador1(d1);
        r.setNumerador2(n2);
        r.setDenominador2(d2);

        System.out.println(" ");
        System.out.printf("La suma es: %.2f u\n", r.sumarFraccion());
        System.out.printf("La resta es: %.2f u\n", r.restarFraccion());
        System.out.printf("La multiplicacion es: %.2f u\n", r.multiplicarFraccion());
        System.out.printf("La division es: %.3f u\n", r.dividirFraccion());

    }
}
