/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Stack;

/**
 *
 * @author diogo
 */
public class Mavenproject2 {

   public static String inverterPalavras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        String[] palavras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }

            StringBuilder palavraInvertida = new StringBuilder();

            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());
            }

            resultado.append(palavraInvertida).append(" ");
        }

        resultado.setLength(resultado.length() - 1);

        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto1 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String texto2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        String resultado1 = inverterPalavras(texto1);
        String resultado2 = inverterPalavras(texto2);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}