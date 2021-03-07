/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Miguel Andrés
 */
public class Triangulo {
    
    // Atributos de instancia
    private double base;
    private double altura;
    
    
    // Constructor
    public Triangulo(){
        this.base=0;
        this.altura=0;
    }
    
    //Getter y Setter
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public void setAltura(double a){
        this.altura=a;
    }
    
    //Funciones miembros
    
    public double calcularArea(){
       return (this.base * this.altura)/2;
    }
     
    public double calcularLongitud(){
        return (Math.sqrt((base*base)/4 + Math.pow(altura,2)));
    }
    
    public double calcularPerimetro(){
        return this.calcularLongitud()*2 + this.base;
    }
    
}
