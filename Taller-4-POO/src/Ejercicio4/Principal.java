/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner bici = new Scanner(System.in);
        Ejercicio4.Bicicleta r; // Se define la variable del objeto
        r = new Ejercicio4.Bicicleta(); // Se instancia el objeto
        
        System.out.println("\t BICICLETA \n");
        System.out.print("Velocidad: ");
        int vel = bici.nextInt();
        System.out.print("Plato: ");
        int pa = bici.nextInt();
        System.out.print("Piñon: ");
        int pia = bici.nextInt();
        
        //cambia de estado 
        r.setVelocidadactual(vel);
        r.setPlato(pa);
        r.setPiñon(pia);
        
        System.out.println(" ");
        System.out.printf("La velocidad actual es: %d\n", r.getVelocidadactual());
        System.out.printf("El numero de plato es: %d\n", r.getPlato());
        System.out.printf("El numero de piñon es: %d\n\n", r.getPiñon());
        System.out.printf("Aceleracion: %d\n", r.Acelerar());
        System.out.printf("Frenar: %d\n", r.Frenar());
        System.out.printf("Plato actual: %d\n", r.Cambiarplato(pa));
        System.out.printf("Piñon actual: %d\n", r.Cambiarpiñon(pia));
    }
     
    
    
          
}

