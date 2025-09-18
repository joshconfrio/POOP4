/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4j;

/**
 *
 * @author joshy
 */
public class TrianguloRectangulo {
    
    // Atributos
    float ladoA;
    float ladoB;
    float hipotenusa;
    float anguloA;
    float anguloB;
    float anguloC;
    String color;

    // Constructor vacío
    public TrianguloRectangulo() {

    }

    // Constructor con parámetros
    public TrianguloRectangulo(float ladoA, float ladoB, float hipotenusa,
            float anguloA, float anguloB, float anguloC, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.hipotenusa = hipotenusa;
        this.anguloA = anguloA;
        this.anguloB = anguloB;
        this.anguloC = anguloC;
        this.color = color;
    }

    // Métodos de acción (solo muestran fórmulas)
    public void teoremaPitagoras() {
        System.out.println("Teorema de Pitágoras: Hipotenusa² = LadoA² + LadoB²");
    }

    public void direccionFuerzas() {
        System.out.println("Dirección de fuerzas: Resultante = √(Fx² + Fy²)");
    }

    public void funcionesTrig() {
        System.out.println("Funciones trigonométricas:");
        System.out.println("Seno = cateto opuesto / hipotenusa");
        System.out.println("Coseno = cateto adyacente / hipotenusa");
        System.out.println("Tangente = cateto opuesto / cateto adyacente");
    }

    // Método para imprimir atributos
    public void imprimirTriangulo() {
        System.out.println("=== Triángulo Rectángulo ===");
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Ángulo A: " + anguloA + "°");
        System.out.println("Ángulo B: " + anguloB + "°");
        System.out.println("Ángulo C: " + anguloC + "°");
        System.out.println("Color: " + color);
    }
}
