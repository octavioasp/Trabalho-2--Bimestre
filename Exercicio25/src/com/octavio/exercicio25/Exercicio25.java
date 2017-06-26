package com.octavio.exercicio25;

import java.util.Scanner;

/*
 *  25) Crie um algoritmo que 
 *  gere os números de Pell. 
 */

public class Exercicio25 {

	public static void main(String[] args) {
	//	System.out.println("0 ");
		
		for (int i = 1; i <= 25; i++) {

			
			System.out.println(numPell(i));

		}

	}

	public static long numPell(long num) {
		if (num == 0) {
			return 0;
			
		} else if (num == 1) {
			return 1;

		} else {
			return (2 * numPell(num - 1)) + numPell(num -2);

		}

	}

}
