/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Miguel Andrés
 */
public class Coche {
    
    //Atributos
    private String color;
    private String marca;
    private int modelo;
    private int num_caballo;
    private int num_puertas;
    private String matricula;
    
    //Constructor
    public Coche(){
        this.color=" ";
        this.marca=" ";
        this.modelo=0;
        this.num_caballo=0;
        this.num_puertas=0;
        this.matricula=" ";
    } 
    
    //Funciones miembros 
    public String getColor(){return this.color;}
    
    public void setColor(String c){this.color = c;}
    
    
    public String getMarca(){return this.marca;}
    
    public void setMarca(String m){this.marca = m;}
    
    
    public int getModelo(){return this.modelo;}
    
    public void setModelo(int mo){this.modelo = mo;}
    
    
    public int getNumcaballos(){return this.num_caballo;}
    
    public void setNumcaballos(int nc){this.num_caballo = nc;}
    
    
    public int getNumpuertas(){return this.num_puertas;}
    
    public void setNumpuertas(int np){this.num_puertas = np;}
    
    
    public String getMatricula(){return this.matricula;}
    
    public void setMatricula(String mt){this.matricula = mt;}


 }
