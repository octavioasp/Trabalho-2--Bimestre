package com.octavio.exercicio14;

import java.util.Scanner;

/*
 * 14) Crie um algoritmo que solicita faltas 
 *     de 10 alunos e imprima a média aritmética 
 *     utilizando recursividade.
 */

public class Exercicio14 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Vetor que armazena as faltas.
		int[] faltas = new int[10];

		// Recebe a entrada das faltas
		for (int i = 0; i < faltas.length; i++) {
			System.out.print("Digite as faltas do " + (i + 1) + "º aluno: ");
			int nota = sc.nextInt();
			faltas[i] = nota;
		}

		// Recebe a soma das faltas e devolve a media aritmetica
		System.out.println ("A media de faltas eh: " + (mediaFaltas(faltas, faltas.length))/faltas.length);

	}

	// Funcao que realiza a soma das faltas+-+-
	public static int mediaFaltas(int[] faltas, int tam) {

		if (tam > 0) {
			
			return faltas[tam - 1] + (mediaFaltas(faltas, tam - 1));
			
			
		} else {
			return 0;

		}
	}
}