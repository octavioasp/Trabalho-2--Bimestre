package com.octavio.exercicio24;

import java.util.Scanner;

/*
 * 24) Crie um algoritmo que 
 *     gere a Torre de Hanoi.
 * 
 * 
 */

public class Exercicio24 {

	public static void main(String[] args) {
		int numDiscos;

		// recebe o número de discos digitado pelo usuário
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		numDiscos = sc.nextInt();

		// executa o hanoi!
		Exercicio24.hanoi(numDiscos, 1, 3, 2);

	}

	private static void mover(int pinoOrigem, int pinoDestino) {
		System.out.println(pinoOrigem + " -> " + pinoDestino);

	}

	static void hanoi(int numDiscos, int pinoOrigem, int pinoDestino, int pinoAuxiliar) {

		if (numDiscos > 0) {
			hanoi(numDiscos - 1, pinoOrigem, pinoAuxiliar, pinoDestino);
			mover(pinoOrigem, pinoDestino);
			hanoi(numDiscos - 1, pinoAuxiliar, pinoDestino, pinoOrigem);
		}

	}

}
