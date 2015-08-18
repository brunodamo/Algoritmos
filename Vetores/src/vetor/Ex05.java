package vetor;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 

		String gabarito[] = new String[8];
		int aluno[] = new int[10];
		String prova[] = new String[8];
		int pontuacao = 0;
		int nota[] = new int[10];
		double pct =0;


		System.out.println("GABARITO");
		for (int i =0; i<gabarito.length;i++){
			System.out.println("Insira o gabarito da "+(i+1)+"ª questão:");
			gabarito[i] = entrada.nextLine();
		}
		System.out.println("Gabarito salvo com sucesso !");

		for (int j =0; j<aluno.length;j++){
			System.out.println("Insira o número do "+(j+1)+" aluno: ");
			aluno[j] = entrada.nextInt();
			entrada.nextLine();
			for (int i =0; i<prova.length;i++){
				System.out.println("Insira a resposta da "+(i+1)+ "ª questão:");
				prova[i] = entrada.nextLine();
				if (prova[i].equalsIgnoreCase(gabarito[i])){
					pontuacao++;
				}
			}
			nota[j]=pontuacao;
			pontuacao=0;
			System.out.println("A nota do aluno "+aluno[j]+ " é: "+nota[j]);
		}

		for (int j=0; j<aluno.length;j++){
			if (nota[j]>=6){
				pct++;
			}

			entrada.close();
		}

	}
}
