package com.octavio.exercicio12;

/*
 * 12) Crie um algoritmo que imprime a 
 *     tabuada de um número informado 
 *     pelo usuário utilizando recursividade.
 * 
 */

import java.util.Scanner;

public class Exercicio12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		int y = 0;

		for (int i = 0; i <= 10; i++) {
			
			System.out.println(x + " x " + i + " = " +tabuada(x, y ++));

		}

	}

	public static int tabuada(int x, int y) {

		

		if (x == 0) {
			return 0;
		
		} 
	
		else {
			return x + tabuada(y - 1, x);
		}

		
	}
}