package fixacao;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String[]nomePaciente = new String[3];
		Double[]tempCorporal = new Double[3];
		
		int i=0;
		
		while (i<3){
			System.out.println("Insira o nome do paciente:");
			nomePaciente[i] = entrada.next();
			System.out.println("Insira a temperatura corporal do paciente:");
			tempCorporal[i] = entrada.nextDouble();
			i++;
		}
		
		for (i=0;i<3;i++){
			if (tempCorporal[i]>37){
				System.out.println("O paciente "+nomePaciente[i]+" está com "+tempCorporal[i]+" e está com febre !");
			}
		}
		
		entrada.close();
	}

}
