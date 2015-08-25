package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double vendasSemanaisVendedor[][] = new double [5][4];
		double vendaMensal = 0;
		double totalSemana[] = new double[4];
		double totalMensal =0;

		
		//Entrada de vendas mensais por vendedor
		for (int vendedor = 0; vendedor < vendasSemanaisVendedor.length; vendedor++) {
			System.out.println("Insira as vendas do " + (vendedor+1) + "º vendedor:");
			for (int semanas = 0; semanas < vendasSemanaisVendedor[vendedor].length; semanas++) {
				System.out.println("\tInsira as vendas da " + (semanas+1) + "ª semana: ");
				vendasSemanaisVendedor[vendedor][semanas] = 100*(vendedor+1);			
				totalSemana[semanas] += vendasSemanaisVendedor[vendedor][semanas];  
			}
		}
		
		//Venda mensal de cada vendedor
		System.out.println("========= VENDAS MENSAIS POR VENDEDOR=========");
		for (int i = 0; i < vendasSemanaisVendedor.length; i++) {
			for (int j = 0; j < vendasSemanaisVendedor[i].length; j++) {
				vendaMensal += vendasSemanaisVendedor[i][j];
			}
			System.out.println("Venda mensal do " + (i+1) + "º vendedor: R$"+vendaMensal );
			vendaMensal = 0;
		}
		
		//Venda total semanal
		System.out.println("========= TOTAL SEMANAL =========");
		for (int semana = 0; semana < vendasSemanaisVendedor.length; semana++) {
			
		}
		
		for (int i = 0; i < totalSemana.length; i++) {
			System.out.println("Total da " + (i+1) + "ª semana: " + totalSemana[i]);
			//Total vendas mes
			
		}
		
		System.out.println("========= TOTAL MENSAL GERAL =========");
		for (int i = 0; i < totalSemana.length; i++) {
			totalMensal+=totalSemana[i];
		}
		System.out.println("Total de vendas no mês: "+(totalMensal));
		
		entrada.close();
	}
}
