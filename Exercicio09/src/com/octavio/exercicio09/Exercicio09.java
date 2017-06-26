package com.octavio.exercicio09;

/*
 * 09) Crie um algoritmo que imprime números
 *     impares de 0 até 100 em ordem decrescente 
 *     utilizando recursividade.
 */

public class Exercicio09 {

	public static void main(String[] args) {
		imprimeNumerosImpares(100);

	}

	public static void imprimeNumerosImpares(int num) {

		if (num >= 0) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
			imprimeNumerosImpares(num - 1);

		}
	}

}