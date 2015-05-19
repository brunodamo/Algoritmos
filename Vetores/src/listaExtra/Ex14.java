package listaExtra;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		DecimalFormat nf = new DecimalFormat ("R$ #,##0.00");
		
		String[] produto = new String[11];
		int[] codigo = new int[11];
		double[] valor = new double[11];
		double novoPreco=0;
		int i=0;
		
		for (i=0;i<10;i++){	
			System.out.println("Insira o nome do "+(i+1)+"o. produto: ");
			produto[i]=entrada.next();
			System.out.println("Insira o código do "+(i+1)+"o. produto: ");
			codigo[i]=entrada.nextInt();
			System.out.println("Insira o valor do "+(i+1)+"o. produto: ");
			valor[i]=entrada.nextDouble();
			
			if ((codigo[i]%2==0) && (valor[i]>1000)){
				novoPreco=valor[i]*1.2;
			} else if ((codigo[i]%2==0 && (valor[i]<=1000))){
				novoPreco=valor[i]*1.15;
				}else if((codigo[i]%2!=0) && (valor[i]>1000)){
					novoPreco=valor[i]*1.1;
				}else{
					novoPreco=valor[i];
				}
		}
		
		for(i=0;i<10;i++){
			if (novoPreco>valor[i]){
				System.out.println("O produto "+produto[i]+" de código "+codigo[i]+ " e valor "+nf.format(valor[i])+" tem como novo valor de:"+nf.format(novoPreco));
			}
		}
		
		entrada.close();

	}

}
