package vetor;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota[] = new double[5];
		double media;
		int notaAcima = 0;
		int notaAbaixo =0;
		int notaIgual =0;
		double somaNota=0;
		
		//Captação das notas do aluno
		for(int i =0; i <nota.length; i++){
			System.out.println("Insira a " +(i+1)+ " nota do aluno: ");
			nota[i] = entrada.nextDouble();
			somaNota += nota[i];
		}

		//Calculo da média
		media = (somaNota/nota.length);

		//Contador de colocação da nota
		for (int i =0; i<nota.length;i++){
			if(nota[i] < media){
				notaAbaixo++;
			}else if (nota[i] > media){
				notaAcima++;
			}else{
				notaIgual++;
			}
		}
		
		//Exibir relatório final
		System.out.println("Relatório Final: \n");
		System.out.println("A média geral é: "+media);
		System.out.println("Total de notas acima da média: "+notaAcima);
		System.out.println("Total de notas abaixo da média: "+notaAbaixo);
		System.out.println("Total de notas na média: "+notaIgual);

		entrada.close();
	}

}
