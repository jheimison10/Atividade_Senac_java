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
public class atividade6 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }
}