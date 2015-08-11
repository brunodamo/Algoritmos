package br.com.fiap.vetor;

import java.util.Scanner;

public class PropVetor {


	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);

		// Declaração e Instanciação
		int x [] = new int[3];
		
		for (int i = 0; i < x.length; i++){
			System.out.println("Insira o valor da posição " + i + ":");
			x[i] = entrada.nextInt();
		}

//		//Declaração, Instaciação e Atribuição
//		int y[] = {1, 2, 3};


		//Utilizado quando não se necessita trabalhar com índice
		//sendo apenas necessário apresentar os dados contidos no vetor
		for (int valorVetor : x){
			System.out.println("O valor digitado foi: " + valorVetor);
		}
		entrada.close();
	}
}
