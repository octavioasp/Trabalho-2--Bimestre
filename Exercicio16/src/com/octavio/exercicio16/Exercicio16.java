package com.octavio.exercicio16;

import java.util.Scanner;

/*
 * 16) Crie um algoritmo que solicita o nome 
 *     de 10 alunos e imprima todos os nomes 
 *     armazenados utilizando recursividade.
 */

public class Exercicio16 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Vetor que armazena os nomes
		String[] nomes = new String[10];

		// Recebe a entrada dos nomes
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º nome: : ");
			String nome = sc.next();
			nomes[i] = nome;
		}

		// Recebe a soma das idades e devolve a media aritmetica
		System.out.println ("Nomes: ");
		System.out.println (exibeNomes(nomes, nomes.length));

	}

	// Funcao que realiza a soma das idades
	public static String exibeNomes(String[] nomes, int tam) {

		if (tam > 0) {
			
			return (nomes[tam - 1] + (exibeNomes(nomes, tam - 1)));
			
			
		} else {
			return "";

		}
	}
}