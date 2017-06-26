package com.octavio.exercicio19;

import java.util.Scanner;

/*
 *  19) Crie um algoritmo que dado um número n, 
 *      gere todas as possíveis combinações com as n 
 *      primeiras letras do alfabeto. Ex.: n = 3. 
 *      Resposta: ABC, ACB, BAC, BCA, CAB, CBA.
 */

public class Exercicio19 {
	static Scanner sc = new Scanner(System.in);
	static int tam;

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		int entrada = sc.nextInt();
		tam = entrada;
		String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "X", "W", "Y", "Z" };

	
		entrada(alfabeto);
		

	}

	public static void entrada(String[] alfabeto) {
		for (int i = 1; i < tam; i++) {

			System.out.print(alfabeto[i]);
		}

	}

	private static void Troca_Posicao(String[] alfabeto, int k, int i) {
		String aux;
		aux = alfabeto[i];
		alfabeto[i] = alfabeto[k];
		alfabeto[k] = aux;
		System.out.print(alfabeto[i]);
	}

}
