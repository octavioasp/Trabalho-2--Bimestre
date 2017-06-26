package com.octavio.exercicio20;

import java.util.Scanner;

/* 20) Crie um algoritmo para 
 *     calcular o fatorial de 
 *     um número.
 */

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Digite um numero para fatorial: ");
		long num = sc.nextLong();
		num = Math.abs(num);
		System.out.println(num +"! = " +fatorial(num));
		
		sc.close();
	}

	public static long fatorial(long num) {

		if (num <= 1) {
			return 1;
		} else {
			return num *= fatorial(num - 1);
		}

	}

}
