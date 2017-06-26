package com.octavio.exercicio23;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 23) Crie o algoritmo de euclides para 
 *     encontrar o máximo divisor comum (MDC) 
 *     entre dois números inteiros diferentes de zero.
 */

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();

		System.out.println("O MDC entre " + num1 + " e " + num2 + " eh: " + mdc(num1, num2));

	}

	//Calcula o Maximo divisor comum entre dois numeros
	public static int mdc(int num1, int num2) {
	
		int mdc = num1 % num2;

		if (mdc == 0) {
			return num2;
		} else {
			return mdc(num2, mdc);
		}

	}

}
