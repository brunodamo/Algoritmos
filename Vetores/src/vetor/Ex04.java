package vetor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		String nome[] = new String[5];
		double salario[] = new double[5];
		int tempo[] = new int[5];
		double reajuste[] = new double[5];

		for (int i = 0; i<nome.length; i++){
			System.out.println("Insira o nome do "+(i+1)+ "º funcionário: ");
			nome[i] = entrada.nextLine();
			System.out.println("Insira o salário de "+nome[i]+ ":");
			salario[i] = entrada.nextDouble();
			System.out.println("Insira o tempo de empresa de "+nome[i]+ ":");
			tempo[i] = entrada.nextInt();
			entrada.nextLine();

		}

		System.out.println("========== Não terão aumento ==========");
		for (int i=0; i<nome.length;i++){
			if ((tempo[i]<=5) || (salario[i]>=400)){
				System.out.println("\tNome:"+nome[i]);
			}
		}

		for (int i=0; i<nome.length;i++){
			if ((tempo[i]>5) && (salario[i]<400)){
				reajuste[i] = salario[i]*1.35;
			}else if (tempo[i] > 5){
				reajuste[i] = salario[i]*1.25;
			}else if (salario[i]<400){
				reajuste[i] = salario[i]*1.15;
			}
			System.out.println("\tO funcionário "+nome[i]+ " receberá "+nf.format(reajuste[i]));
		}
		System.out.println("========== Terão aumento ==========");
		for (int i=0; i<nome.length;i++){
			
		}

		entrada.close();

	}

}
