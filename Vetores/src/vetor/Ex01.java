package br.com.fiap.vetor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double tempMedia[] = new double[12];
		int maiorMes=0;
		int menorMes=0;
		double maiorTemp=0;
		double menorTemp=0;

		for (int i =0; i<tempMedia.length;i++){
			System.out.println("Insira a temperatura média do mês de "+mes[i]+ ":");
			tempMedia[i] = entrada.nextDouble();
			if (i == 0){
				maiorMes = i;
				menorMes = i;
				maiorTemp = tempMedia[i];
				menorTemp = tempMedia[i];
			}else{
				if (tempMedia[i]>maiorTemp){
					maiorTemp = tempMedia[i];
					maiorMes = i;
				}else if (tempMedia[i]<menorTemp){
					menorTemp = tempMedia[i];
					menorMes =  i;
				}
			}
		}
		
		System.out.println("O mês com a maior temperatura foi: "+mes[maiorMes]);
		System.out.println("O mes com a menor temperatura foi: "+mes[menorMes]);
		
	}




}
