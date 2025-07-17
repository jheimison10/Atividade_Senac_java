/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

import java.util.Scanner;

/**
 *
 * @author Aluno01
 */
public class atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado A do triângulo:");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado B do triângulo:");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado C do triângulo:");
        double ladoC = scanner.nextDouble();

        double perimetro = ladoA + ladoB + ladoC;

        System.out.println("O perímetro do triângulo é: " + perimetro);

        scanner.close();
    }
}
