package br.com.generation.www;

import java.util.Random;

public class ex02 {

	  public static void main(String[] args) throws InterruptedException {

	        Random randomGeneration = new Random();
	        int[] dice = new int[10];
	        int maior=0, quantponto=0, result;//soma=0,
	        double media= 0.0, soma = 0.0;

	        System.out.println();
	        for(int i = 0; i < 10; i++) {
	            result = randomGeneration.nextInt(1, 6);
	            System.out.println((i+1) + "� Arremesso: " + result);
	            Thread.sleep(500);
	            dice[i] = result;
	            soma = soma + result;
	            media = soma / 10;
	            if(maior < result) {
	                maior = result;
	            }
	        }
	        for(int i = 0; i < 10; i++) {
	            if(dice[i] == maior) {
	                quantponto++;
	            }
	        }
	        System.out.println();
	        System.out.print("A soma dos resultados �: " + soma);
	        System.out.println();
	        System.out.print("O maior valor �: " + maior);
	        System.out.println();
	        System.out.print("A quantidade da maior pontua��o �: " + quantponto);
	        System.out.println();
	        System.out.print("A m�dia dos valores s�o: " + media);
		
		
		

	}

}
