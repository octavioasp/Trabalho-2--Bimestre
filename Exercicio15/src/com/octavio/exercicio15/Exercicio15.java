package com.octavio.exercicio15;

import java.util.Scanner;

/*
 *  15) Crie um algoritmo que solicita 
 *      a idade de 10 alunos e imprima 
 *      a média aritmética utilizando 
 *      recursividade. 
 */

public class Exercicio15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Vetor que armazena as idades
		int[] idade = new int[10];

		// Recebe a entrada das idades
		for (int i = 0; i < idade.length; i++) {
			System.out.print("Digite a idade do " + (i + 1) + "º aluno: ");
			int nota = sc.nextInt();
			idade[i] = nota;
		}

		// Recebe a soma das idades e devolve a media aritmetica
		System.out.println ("A media de idade eh: " + (mediaIdade(idade, idade.length))/idade.length + " anos");

	}

	// Funcao que realiza a soma das idades
	public static int mediaIdade(int[] idade, int tam) {

		if (tam > 0) {
			
			return idade[tam - 1] + (mediaIdade(idade, tam - 1));
			
			
		} else {
			return 0;

		}
	}
}