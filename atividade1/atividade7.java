/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author Aluno01
 */
public class atividade7 {
    public static void main(String[] args) {
        // Defina as dimensões do retângulo
        double base = 10.0;
        double altura = 5.0;

        // Calcule a área
        double area = calcularAreaRetangulo(base, altura);

        // Exiba o resultado
        System.out.println("A área do retângulo é: " + area);
    }

    // Método para calcular a área do retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}
