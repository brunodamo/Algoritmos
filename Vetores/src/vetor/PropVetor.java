package br.com.fiap.vetor;

import java.util.Scanner;

public class PropVetor {


	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);

		// Declara��o e Instancia��o
		int x [] = new int[3];
		
		for (int i = 0; i < x.length; i++){
			System.out.println("Insira o valor da posi��o " + i + ":");
			x[i] = entrada.nextInt();
		}

//		//Declara��o, Instacia��o e Atribui��o
//		int y[] = {1, 2, 3};


		//Utilizado quando n�o se necessita trabalhar com �ndice
		//sendo apenas necess�rio apresentar os dados contidos no vetor
		for (int valorVetor : x){
			System.out.println("O valor digitado foi: " + valorVetor);
		}
		entrada.close();
	}
}
