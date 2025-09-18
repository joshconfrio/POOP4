/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4j;

/**
 *
 * @author poo02alu19
 */
public class POOP4J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Punto punto1 = new Punto();
       punto1.imprimirPunto();
       punto1.x = 4;
       punto1.y = 7;
       punto1.imprimirPunto();
       
       Punto punto2 = new Punto(10,88);
       punto2.imprimirPunto();
       
        System.out.println("Punto2 x="+punto2.x);
        
        Carro carro1 = new Carro();
        carro1.imprimirCarro();
        carro1.anio = 2020;
        carro1.numPuertas = 4;
        carro1.marca = "Honda";
        carro1.color = "Rojo";
        carro1.imprimirCarro();
        
        Carro carro2 = new Carro("Chevrolet", 2022, "Azul", 2);
        carro2.imprimirCarro();
        
        Profesor profesor1 = new Profesor();
        profesor1.ImprimirProfesor();
        
        profesor1.divisionQuePertenece="Calculo";
        profesor1.horarioClase=12.0;
        profesor1.materiaImparte="Integral";
        profesor1.universidad="UNAM";
        
        profesor1.ImprimirProfesor();
        
        Perro perro1 = new Perro();
        perro1.nombre = "Firulais";
        perro1.color = "Café";
        perro1.raza = "Labrador";
        perro1.numPatas = 4;
        perro1.numOrejas = 2;
        perro1.imprimirPerro();
        perro1.ladrar();
        perro1.correr();

        Perro perro2 = new Perro("Max", "Negro", "Pastor Alemán", 4, 2);
        perro2.imprimirPerro();
        perro2.jugar();
        perro2.dormir();
        
        TrianguloRectangulo t1 = new TrianguloRectangulo(3.0f, 4.0f, 5.0f, 30.0f, 60.0f, 90.0f, "Verde");
        t1.imprimirTriangulo();
        t1.teoremaPitagoras();
        t1.direccionFuerzas();
        t1.funcionesTrig();
    }
    
}

