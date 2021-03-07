/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Miguel Andrés
 */
public class Bicicleta {
    
    //Atributos
    private int velocidadactual;
    private int plato_actual;
    private int piñon_actual;
    
    //Constructor
    public Bicicleta(){
        this.velocidadactual=0;
        this.plato_actual=0;
        this.piñon_actual=0;
    }
    
    //Getter y Setter
    public int getVelocidadactual(){
        return velocidadactual;
    }
    
    public void setVelocidadactual(int vel){
        this.velocidadactual = vel;
    }
    
    public int getPlato(){
        return plato_actual;
    }
    
    public void setPlato(int pa){
        this.plato_actual = pa;
    }
    
    public int getPiñon(){
        return piñon_actual;
    }
    
    public void setPiñon(int pia){
        this.piñon_actual = pia;
    }
    
    //Funciones miembros
    public int Acelerar(){
        return 2*this.velocidadactual;
    }
    
    public int Frenar(){
        return this.velocidadactual/2;
    }
    
    public int Cambiarplato(int pa){
        return this.plato_actual;
    }
    
    public int Cambiarpiñon(int pia){
        return this.piñon_actual;
    }
}
