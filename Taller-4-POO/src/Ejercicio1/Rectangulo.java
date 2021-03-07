/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Miguel Andrés
 */
public class Rectangulo {
    
    //Atributos
    private double longitud;
    private double ancho;
    
    //Constructor
    public Rectangulo(){
        this.longitud=0;
        this.ancho=0;
    }
    
    // Getter y Setter
    public double getLongitud(){
        return this.longitud;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public void setLongitud(double l){
        this.longitud = l;
    }
    
    public void setAncho(double a){
        this.ancho=a;
    }
       
    // Funciones miembros
    public double calcularArea(){
        return this.longitud * this.ancho;
    }
    
    public double calcularPerimetro(){
        return 2 * (this.longitud+this.ancho);
    }
    
}
