package com.octavio.exercicio07;

/*
 * 07) Crie um algoritmo que imprime números
 *     impares de 0 até 100 em ordem crescente
 *     utilizando recursividade.
 */

public class Exercicio07 {

	public static void main(String[] args) {
		imprimeNumerosImpares(0);

		}

		public static void imprimeNumerosImpares(int num) {

			if (num <= 100) {
				if (num % 2 != 0) {
					System.out.println(num);
				}
				imprimeNumerosImpares(num + 1);

			}
		}

	}
