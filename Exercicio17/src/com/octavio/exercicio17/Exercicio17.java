package com.octavio.exercicio17;

import java.util.Scanner;

/*
 *  17) Crie um algoritmo que multiplica dois 
 *      números naturais, através de somas 
 *      sucessivas utilizando recursividade 
 *      (Ex.: 6 x 4 = 4 + 4 + 4 + 4 + 4 + 4). 
 * 
 */

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();

		result = mult(num1, num2);
		System.out.println("O resultado eh: " + result);

		

	}

	public static int mult(int num1, int num2) {
		if (num2 == 0)
			return num2;
		else
			return num1 + mult(num1, num2 - 1);
	}

}
