/*
Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
Encontre os números divisíveis por 3.
*/

package com.company;

public class Exercicio02 {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
       int i = 0;
        while (i < 20) {
            Integer numerosDivisorios = numeros[i]%3;
            boolean numerosDividosPorTres = numerosDivisorios == 0;
            if (numerosDividosPorTres){
                System.out.println(numeros[i] + " é divisivel por 3!");
            }
            i++;
        }
    }
}
