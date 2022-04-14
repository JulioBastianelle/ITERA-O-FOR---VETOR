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
            Integer numero = numeros[i];
            Integer numerosDivisiveisPorTres = numero % 3;
            if (numerosDivisiveisPorTres.equals(0)){
                System.out.println("Numero " + numeros[i] + " é divisivel por 3!");
            }
            i++;
        }
    }
}
