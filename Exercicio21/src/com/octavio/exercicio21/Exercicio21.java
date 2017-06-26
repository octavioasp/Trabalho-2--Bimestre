package com.octavio.exercicio21;

/*
 * 21) Crie um algoritmo para 
 *     calcular números triangulares.
 */

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();

		System.out.println("O numero triangular de " + num + " eh: " + numTriangular(num));

	}

	public static long numTriangular(long num) {
		if (num == 1) {
			return 1;
		} else {
			return num + numTriangular(num - 1);

		}

	}

}
