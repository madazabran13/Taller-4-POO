/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author Miguel Andrés
 */
public class Fraccion {
    
    // Atributos de instancia
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;
    
 
    
    // Constructor
    public Fraccion(){
        this.numerador1=0;
        this.denominador1=0;
        this.numerador2=0;
        this.denominador2=0;
    }

    
    //Getter y Setter
    
    public int getNumerador1(){
        return this.numerador1;
    }
    
    public void setNumerador1( int n1){
        this.numerador1 = n1;
    }
    
    public int getDenominador1(){
        return this.denominador1;
    }
    
    public void setDenominador1( int d1){
        this.denominador1 = d1;
    }
    
    public int getNumerador2(){
        return this.numerador2;
    }
    
    public void setNumerador2( int n2){
        this.numerador2 = n2;
    }
    
    public int getDenominador2(){
        return this.denominador2;
    }
    
    public void setDenominador2( int d2){
        this.denominador2 = d2;
    }
    
    //Funciones miembros
    
    public double sumarFraccion(){
        return (this.numerador1/this.denominador1) + (this.numerador2/this.denominador2);
    }
    
    public double restarFraccion(){
        return (this.numerador1/this.denominador1) - (this.numerador2/this.denominador2);
    }
    
    public double multiplicarFraccion(){
        return (this.numerador1/this.denominador1) * (this.numerador2/this.denominador2);     
    }
    
    public double dividirFraccion(){
        return (this.numerador1/this.denominador1/this.numerador2/this.denominador2); 
        
    }

      
}
