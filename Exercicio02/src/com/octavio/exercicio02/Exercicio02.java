package com.octavio.exercicio02;

/* 
 * 02) Crie um algoritmo que imprime números 
*  de 0 até 100 em ordem decrescente 
*  utilizando recursividade.
*/

public class Exercicio02 {

	public static void main(String[] args) {
		imprimeNumeros(100);

	}

	public static void imprimeNumeros(int num) {

		if (num >=0) {
			System.out.println(num);
			imprimeNumeros(num - 1);
			
		}
	}

}
