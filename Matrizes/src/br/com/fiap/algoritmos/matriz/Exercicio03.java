package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String produto[] = new String[5];	
		double precoProdutoLoja[][] = new double[5][4];
		double custoTransporte[] = new double[5];
		double valorImpostoProduto[][] = new double[5][4];
		
		for (int i = 0; i<produto.length;i++){
			System.out.println("Insira o nome do "+(i+1)+"º produto: ");
			produto[i] = entrada.nextLine();
		}
		
		for (int i = 0; i<precoProdutoLoja.length;i++){
			for (int j=0; j<precoProdutoLoja[i].length;j++){
			System.out.println("Insira o valor do produto " + produto[i] + " na "+(j+1)+"ª loja: ");
			precoProdutoLoja[i][j] = Math.random()*100;
			}
		}
		
		
		for (int i = 0; i<custoTransporte.length;i++){
			System.out.println("Insira o valor do transporte do produto "+produto[i]);
			custoTransporte[i] = Math.random()*100;
		}
		
		for (int i = 0; i<precoProdutoLoja.length;i++){
			for (int j=0; j<precoProdutoLoja[i].length;j++){
				if (precoProdutoLoja[i][j] <= 50){
					valorImpostoProduto[i][j] = precoProdutoLoja[i][j] * 0.05;
				}else if (precoProdutoLoja[i][j] <= 100){
					valorImpostoProduto[i][j] = precoProdutoLoja[i][j] * 0.1;
				}else{
					valorImpostoProduto[i][j] = precoProdutoLoja[i][j] * 0.2;
				}
			}
		}	
		
		System.out.println("==== RELATÓRIO FINAL ====");
		for (int i=0; i<precoProdutoLoja.length;i++){
			System.out.println("Produto: " + produto[i]);
			for (int j=0; j<precoProdutoLoja[i].length;j++){
				System.out.println("\tna Loja ["+(j+1)+"] com valor de imposto de " + (valorImpostoProduto[i][j]) + "%, "
						+ "com custo de transporte: R$" + custoTransporte[i] + 
						" de preço inicial: R$" + precoProdutoLoja[i][j] +
						" e preço final: R$" + (precoProdutoLoja[i][j]+valorImpostoProduto[i][j]+custoTransporte[i]));
			}
		}
		
		
		
		entrada.close();
	}

}
