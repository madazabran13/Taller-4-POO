/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author Miguel Andrés
 */
public class Caidalibre {
    
    // Atributos de instancia
    private double gravedad;
    private double tiempo;
    private double velinicial;
    
    
    // Constructor
    public Caidalibre(){
        this.gravedad=0;
        this.tiempo=0;
        this.velinicial=0;
    }
    
    //Getter y Setter
    
    public double getGravedad(){
        return this.gravedad;
    }
    
    public void setGravedad(double g){
        this.gravedad = g;
    }
    
    public double getTiempo(){
        return this.tiempo;
    }
    
    public void setTiempo(double t){
        this.tiempo=t;
    }
    
    public double getVelinicial(){
        return this.velinicial;
    }
    
    public void setVelinicial(double vi){
        this.velinicial=vi;
    }
    
    //Funciones miembros
    
    public double calcularDistancia(){
       return (this.gravedad*this.tiempo*this.tiempo)/2;
    }
     
    public double calcularVelocidad(){
        return this.velinicial + this.gravedad*this.tiempo;
    }
    
}
