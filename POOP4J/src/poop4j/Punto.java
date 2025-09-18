package poop4j;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu19
 */
public class Punto {
    
  //ATRIBUTOS
    int x;
    int y;
    
    //METODOS
    //METODO CONSTRUCTOR
    public Punto(){
        //x=0;
        //y=0;
    }
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }
    //METODO DE ACCIÒN
    public void imprimirPunto(){
        System.out.println("("+x+","+y+")");
    }   
}
