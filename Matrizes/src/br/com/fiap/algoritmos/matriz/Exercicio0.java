package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String alunosNome[] = new String [3];
		double alunosNotas[][] = new double [3][3];
		double soma = 0;
		double mediaFinal[] = new double[3];

		//Cadastrar notas dos alunos

		//Primeiro for utilizado para linhas
		for (int linhas = 0; linhas < alunosNotas.length; linhas++){
			System.out.println("Insira o nome do [" + (linhas+1) + "] Aluno:");
			alunosNome[linhas] = entrada.nextLine();

			//Segundo for utilizado para colunas
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++){

				System.out.println("Insira a nota [" + (colunas+1) +  "]:");
				alunosNotas[linhas][colunas] = entrada.nextDouble();
				entrada.nextLine();

				soma += alunosNotas[linhas][colunas];
			} 
			mediaFinal[linhas] = (soma/(alunosNotas[linhas].length));
			soma=0;

		}



		//EXIBE RELATORIO DE NOTAS
		System.out.println("Relatório de notas dos Alunos: \n");
		for (int linhas = 0; linhas < alunosNotas.length; linhas++){
			System.out.println("Aluno [" + alunosNome[linhas] + "]: ");
			for (int colunas = 0; colunas < alunosNotas[linhas].length; colunas++){
				System.out.println("\t Nota [" + (colunas+1) + "] = " + alunosNotas[linhas][colunas]);				
			}
			System.out.println( "\tMédia Final: "+mediaFinal[linhas]);
		}

		entrada.close();

	}

}
