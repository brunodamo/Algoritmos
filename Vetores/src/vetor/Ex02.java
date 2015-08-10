package vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    DecimalFormat fmt = new DecimalFormat("0.00");        

		
		String modelo[] = new String[5];
		double consumo[] = new double[5];
		double menorConsumo = 0;
		double milKm[] = new double[5];
		String economico = null;

		for (int i =0; i<modelo.length;i++){
			System.out.println("Insira o modelo do "+(i+1)+ "º carro:");
			modelo[i] = entrada.next();
			System.out.println("Insira o consumo (km/l) do "+modelo[i]+ ":");
			consumo[i] = entrada.nextDouble();
			while (consumo[i] <= 0 ){
				if (consumo[i] <= 0){
					System.out.println("Consumo inválido !");
					System.out.println("Insira o consumo (km/l) do "+modelo[i]+ ":");
					consumo[i] = entrada.nextDouble();
				}
			}
			if (i==0){
				menorConsumo = consumo[i];
				economico = modelo[i];
			}else if (consumo[i] > menorConsumo){
				menorConsumo = consumo[i];
				economico = modelo[i];
			}
		}
		System.out.println("========== RELATÓRIO ===========");
		System.out.println("O modelo mais econômico é: "+economico+ " fazendo "+menorConsumo+ " km/l");
		for (int i=0; i<modelo.length;i++){
			milKm[i] = 1000/consumo[i];
			System.out.println("O carro "+modelo[i]+ " consome "+fmt.format(milKm[i])+ " litros para percorrer 1000km!");
		}

		entrada.close();
	}

}
