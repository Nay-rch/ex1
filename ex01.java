package br.com.generation.www;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
	Scanner leia = new Scanner(System.in);
	int[] vetor = new int[5];
	int i, maior = 0;
			
			for ( i = 0; i < 5; i++) {
				System.out.println("digite um n�mero: ");
				vetor [i] = leia.nextInt();
				if(i == 0) {
					maior = vetor[0];
				}
				if(vetor[i]> maior) {
					maior = vetor[i];
				}
			}
	System.out.println("\n o maior n�mero �: " + maior);
	
	leia.close();
				}
			
			

	}


