/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Miguel Andrés
 */
public class PruebaCoche {
    
    public static void main(String[] args) {
        
        // Se define las variabless de los objetos y se instancian
        System.out.print("\t**AUTOMOVILES**\n\n");
        
        Coche miCoche = nuevoCoche();
        System.out.println("------------------------------");
        System.out.print("\t**AUTO 1**\n");
        infoCoche(miCoche);
        
        System.out.println("------------------------------");
        
        Coche nuevoCoche = nuevoCoche();
        System.out.println("------------------------------");
        System.out.print("\t**AUTO 2**\n");
        infoCoche(nuevoCoche);
        
    }
    
    
    public static Coche nuevoCoche(){
        Scanner entrada = new Scanner(System.in);
        Coche coche = new Coche();
        
        System.out.print("Marca: ");
        coche.setMarca(entrada.next());
        
        System.out.print("Color: ");
        coche.setColor(entrada.next());
        
        System.out.print("Matricula: ");
        coche.setMatricula(entrada.next());
        
        System.out.print("Modelo: ");
        coche.setModelo(entrada.nextInt());
       
        System.out.print("No Caballos: ");
        coche.setNumcaballos(entrada.nextInt());
        
        System.out.print("No Puertas: ");
        coche.setNumpuertas(entrada.nextInt());
        
        return coche;
    }
    
    public static void infoCoche(Coche coche){
        System.out.println("------------------------------");
        System.out.printf("Color: %s\n",coche.getColor());
        System.out.printf("Marca: %s\n",coche.getMarca());
        System.out.printf("Matricula: %s\n",coche.getMatricula());
        System.out.printf("Modelo: %d\n",coche.getModelo());
        System.out.printf("No Caballos: %d\n",coche.getNumcaballos());
        System.out.printf("No Puertas: %d\n",coche.getNumpuertas());
    }
}
