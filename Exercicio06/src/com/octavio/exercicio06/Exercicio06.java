package com.octavio.exercicio06;

/*
 * 06) Crie um algoritmo que imprime 
 *     n�meros pares de 0 at� 100 em 
 *     ordem crescente utilizando recursividade. 
 */

public class Exercicio06 {

	public static void main(String[] args) {

		imprimeNumerosPares(0);

	}

	public static void imprimeNumerosPares(int num) {

		if (num <= 100) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			imprimeNumerosPares(num + 1);

		}
	}

}
