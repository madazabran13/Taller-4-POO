/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Miguel Andrés
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio_compra,  porc_utilidad, precio_publico;

    public Producto(){
        this.codigo=0;
        this.nombre=" ";
        this.porc_utilidad=0;
        this.precio_compra=0;
        this.precio_publico=0;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPorc_utilidad(){
        return this.porc_utilidad;
    }
    
    public double getPreciocompra(){
        return this.precio_compra;
    }
    
    public double getPreciopublico(){
        return this.precio_publico;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setPorc_utilidad(double pu){
        this.porc_utilidad = pu;
    }
    
    public void setPreciocompra(double pc){
        this.precio_compra = pc;
    }
    
    public void setPreciopublico(double pp){
        this.precio_compra = pp;
    }
    
    public double setPrecioventa(double precio_publico){
        return this.precio_publico;
    }
}
