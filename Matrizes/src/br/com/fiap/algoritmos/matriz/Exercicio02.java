package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nomeLoja[] = new String[8];
		String nomeProduto[] = new String[4];
		double precoLojaProduto[][] = new double[8][4];
		
		for (int i = 0; i < nomeLoja.length; i++){
			System.out.println("Insira o nome da " + (i+1) + "ª loja:");
			nomeLoja[i] = entrada.nextLine();
		}
		
		for (int i = 0; i < nomeProduto.length; i ++){
			System.out.println("Insira o nome da " + (i+1) + "º produto:");
			nomeProduto[i] = entrada.nextLine();
		}	
		
		System.out.println("=== PREÇOS ===");
		for (int i = 0; i < precoLojaProduto.length; i ++){
			System.out.println("Loja: "+nomeLoja[i]);
			for (int j = 0; j < precoLojaProduto[i].length; j++){
				System.out.println("\t Insira o preço do Produto: "+nomeProduto[j]);
				precoLojaProduto[i][j] = entrada.nextDouble();
			}
		}
		
		for (int i = 0; i < precoLojaProduto.length; i ++){
			for (int j = 0; j < precoLojaProduto[i].length; j++){
				if (precoLojaProduto[i][j] <= 120 ){
					System.out.println("O produto " + nomeProduto[j] + " na loja " + nomeLoja[i] + " custa: R$" + precoLojaProduto[i][j]);
				}
			}
		}
		
		
		entrada.close();
	}

}
