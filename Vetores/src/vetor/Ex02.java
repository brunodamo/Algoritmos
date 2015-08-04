package br.com.fiap.vetor;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String modelo[] = new String[5];
		double consumo[] = new double[5];
		
		for (int i =0; i<modelo.length;i++){
			System.out.println("Insira o modelo do "+(i+1)+ "º carro:");
			modelo[i] = entrada.next();
			while (consumo[i] < 0 ){
				System.out.println("Insira o consumo (km/l) do "+modelo[i]+ ":");
				consumo[i] = entrada.nextDouble();
				if (consumo[i] < 0){
					System.out.println("Consumo inválido !");
					System.out.println("Insira o consumo (km/l) do "+modelo[i]+ ":");
					consumo[i] = entrada.nextDouble();
				}
			}
		}
		
		entrada.close();
	}

}
