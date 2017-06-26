package com.octavio.exercicio13;

import java.util.Scanner;

/*     13) Crie um algoritmo que solicita notas
 *     de 10 alunos e imprima a média aritmética 
 *     utilizando recursividade.
 */

public class Exercicio13 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Vetor que armazena as notas.
		double[] notas = new double[10];

		// Recebe a entrada das notas
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "ª nota: ");
			double nota = sc.nextDouble();
			notas[i] = nota;
		}

		// Recebe a soma das notas e devolve a media aritmetica
		System.out.println ("A media eh: " + (mediaNotas(notas, notas.length))/notas.length);

	}

	// Funcao que realiza a soma das notas
	public static double mediaNotas(double[] notas, int tam) {

		if (tam > 0) {
			
			return notas[tam - 1] + (mediaNotas(notas, tam - 1));
			
			
		} else {
			return 0;

		}
	}
}