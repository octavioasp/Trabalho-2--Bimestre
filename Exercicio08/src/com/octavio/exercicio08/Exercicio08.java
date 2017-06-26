package com.octavio.exercicio08;

/*
 * 08) Crie um algoritmo que imprime n�meros
 *     pares de 0 at� 100 em ordem decrescente 
 *     utilizando recursividade.
 */

public class Exercicio08 {

	public static void main(String[] args) {
		imprimeNumerosPares(100);

	}

	public static void imprimeNumerosPares(int num) {

		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			imprimeNumerosPares(num - 1);

		}
	}

}