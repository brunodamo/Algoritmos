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
		
		//Capta��o das notas do aluno
		for(int i =0; i <nota.length; i++){
			System.out.println("Insira a " +(i+1)+ " nota do aluno: ");
			nota[i] = entrada.nextDouble();
			somaNota += nota[i];
		}

		//Calculo da m�dia
		media = (somaNota/nota.length);

		//Contador de coloca��o da nota
		for (int i =0; i<nota.length;i++){
			if(nota[i] < media){
				notaAbaixo++;
			}else if (nota[i] > media){
				notaAcima++;
			}else{
				notaIgual++;
			}
		}
		
		//Exibir relat�rio final
		System.out.println("Relat�rio Final: \n");
		System.out.println("A m�dia geral �: "+media);
		System.out.println("Total de notas acima da m�dia: "+notaAcima);
		System.out.println("Total de notas abaixo da m�dia: "+notaAbaixo);
		System.out.println("Total de notas na m�dia: "+notaIgual);

		entrada.close();
	}

}
