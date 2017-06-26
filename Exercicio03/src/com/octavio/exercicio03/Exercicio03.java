package com.octavio.exercicio03;

/* 
 * 03) Crie um algoritmo que imprime a soma 
 *     dos valores de um Array (Vetor) com 
 *     10 valores inteiros informados pelo 
 *     usuário utilizando recursividade.
 */

import java.util.Scanner;

public class Exercicio03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			int numero = sc.nextInt();
			vetor[i] = numero;
		}

		System.out.println("A soma eh: " + somaValores(vetor, vetor.length));

	}

	public static int somaValores(int[] vetor, int tam) {

		if (tam > 0) {
			return (vetor[tam - 1] + somaValores(vetor, tam - 1));

		} else {
			return 0;

		}

	}

}