/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4j;

/**
 *
 * @author poo02alu19
 */
public class Carro {
    //Atributos
    int anio;
    int numPuertas;
    String marca;
    String color;
    
    
    //Mètodo constructor
    public Carro(){
    
    }
    public Carro(String marca, int anio, String color, int numPuertas){
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.numPuertas = numPuertas;
        
        
        
    }
    
    //Mètodo de acciòn 
    public void avanzar()  {
        System.out.println("coche avanza");
    }
    public void frenar()  {
        System.out.println("coche frena");
    }
    public void sonar()  {
        System.out.println("pip pip");
    }
    public void retroceder()  {
        System.out.println("coche retrocede");
    }
    
    public void imprimirCarro(){
        System.out.println("Marca: "+marca);
        System.out.println("Año: "+anio);
        System.out.println("Color: "+color);
        System.out.println("Numero de puertas: "+numPuertas);
    }
    
}

