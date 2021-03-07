/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Principal {
    public static void main(String[] args) {
        Scanner vel = new Scanner(System.in);
        Ejercicio10.Caidalibre r; // Se define la variable del objeto
        r = new Ejercicio10.Caidalibre(); // Se instancia el objeto
        System.out.println("\t*//CAIDA LIBRE DE UN CUERPO//*\n");
        
        System.out.print("Ingrese la gravedad: ");
        double g = vel.nextDouble();
        System.out.print("Ingrese la velocidad inicial: ");
        double vi = vel.nextDouble();
        System.out.print("Ingrese el tiempo");
        double t = vel.nextDouble();
        
        //cambia de estado 
        r.setGravedad(g);
        r.setVelinicial(vi);
        r.setTiempo(t);
        
        System.out.println(" ");
        System.out.printf("La distancia es: %.2f u\n", r.calcularDistancia());
        System.out.printf("La velocidad final es: %.2f u\n", r.calcularVelocidad());

    }
}
