package com.octavio.exercicio22;

import java.util.Scanner;

/* 
 * 22) Crie um algoritmo para gerar 
 *     a sequência de Fibonacci. 
 */

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		System.out.println("0 ");
		
		for (int i = 1; i <= numero; i++) {

			
			System.out.println(fib(i));

		}

	}

	public static int fib(long num) {
		if (num == 1 || num == 2) {
			return 1;
			
		} else {
			return fib(num - 1) + fib(num - 2);

		}

	}

}
