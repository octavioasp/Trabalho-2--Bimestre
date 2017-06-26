package com.octavio.exercicio04;

import java.util.Scanner;

/*    04) Crie um algoritmo que retorne e imprima 
 *    o menor valor de um Array (Vetor) de 10 
 *    valores inteiros informados pelo usuário 
 *    utilizando recursividade.
 */

public class Exercicio04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			int numero = sc.nextInt();
			vetor[i] = numero;
		}

		int tam = menorValor(vetor, 10);
		System.out.println("O menor valor eh: " + tam);

	}

	public static int menorValor(int vetor[], int tam) {
		int x;
		if (tam == 1) {
			x = vetor[0];

		} else {
			x = menorValor(vetor, tam - 1);
			if (x > vetor[tam - 1])
				x = vetor[tam - 1];
		}
		return x;
	}
}