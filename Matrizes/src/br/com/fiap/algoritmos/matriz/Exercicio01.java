package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		int M[][] = new int [2][2];
		int R[][] = new int [2][2];
		int maiorNumero = Integer.MIN_VALUE;

		//Linhas
		for (int linhas = 0; linhas<M.length; linhas++){
			//Colunas
			for (int colunas = 0; colunas<M[linhas].length; colunas++){
				System.out.println("Preencha a linha [" + (linhas+1) + "] coluna [" + (colunas+1) + "]:");
				M[linhas][colunas] = entrada.nextInt();
				//Percorrer
				if(maiorNumero < M[linhas][colunas]){
					maiorNumero = M[linhas][colunas];
				}
			}
		}
		for (int linhas = 0; linhas<M.length; linhas++){
			//Colunas
			for (int colunas = 0; colunas<M[linhas].length; colunas++){
				R[linhas][colunas] = maiorNumero*M[linhas][colunas];
			}
		}

		System.out.println("==== MATRIZ M ====");
		for (int linhas = 0; linhas<M.length; linhas++){
			for (int colunas = 0; colunas<M[linhas].length; colunas++){
				System.out.print(M[linhas][colunas] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("==== MATRIZ R ====");

		for (int linhas = 0; linhas<M.length; linhas++){
			for (int colunas = 0; colunas<M[linhas].length; colunas++){
				System.out.print(R[linhas][colunas] + " ");
			}
			System.out.println(" ");
		}

		entrada.close();
	}

}
