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
public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double quociente = numero1 / numero2;
            System.out.println("O quociente da divisão é: " + quociente);
        }

        scanner.close();
    }
}

