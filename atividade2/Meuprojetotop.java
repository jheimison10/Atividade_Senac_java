/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class Meuprojetotop {
    public static void main(String[] args) {
        // a) Declarando e inicializando a variável gastosJaneiro
        int gastosJaneiro = 15000;

        // b) Declarando e inicializando as variáveis gastosFevereiro e gastosMarco
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        // c) Calculando o gasto total do trimestre
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        // d) Imprimindo o gasto total do trimestre
        System.out.println("O gasto total no primeiro trimestre foi de R$ " + gastosTrimestre);
    }
}