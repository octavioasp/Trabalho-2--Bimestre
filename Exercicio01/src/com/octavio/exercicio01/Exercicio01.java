package com.octavio.exercicio01;

/* 
 * 01) Crie um algoritmo que imprime números
 *     de 0 até 100 em ordem crescente utilizando 
 *     recursividade.
 */


public class Exercicio01 {

	public static void main(String[] args) {

		imprimeNumeros(0);

	}

	public static void imprimeNumeros(int num) {

		if (num <=100) {
			System.out.println(num);
			imprimeNumeros(num + 1);
			
		}
	}

}
