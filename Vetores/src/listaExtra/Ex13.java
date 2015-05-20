package listaExtra;
import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String[] nomeAluno = new String[11];
		double[] media = new double[11];
		double exame=0;
		double maiorMedia=0;
		String maiorAluno=null;
		int i=0;
		
		for (i=0;i<3;i++){
			System.out.println("Insira o nome do aluno: ");
			nomeAluno[i]=entrada.next();
			System.out.println("Insira a média do aluno: ");
			media[i]=entrada.nextDouble();
		}

		for (i=0;i<3;i++){
			if (i==0){
				maiorMedia=media[i];
				maiorAluno=nomeAluno[i];
			}else{
				if(maiorMedia<media[i]){
				maiorMedia=media[i];
				maiorAluno=nomeAluno[i];
				}
			}
		}
		
		System.out.println("O aluno com maior média é: "+maiorAluno+ " com a média de: "+maiorMedia);
		for (i=0;i<3;i++){
			if (media[i]<7){
				exame=10-media[i];
				System.out.println("O aluno "+nomeAluno[i]+ " precisa tirar "+exame);
			}
		}
		
		entrada.close();

	}

}
