package fixacao;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[]n = new int[11];
		
		int i=0,soma=0;
		double media=0;
		
		while (i<10){
			System.out.println("Insira o "+(i+1)+" n�mero:");
			n[i]=entrada.nextInt();
			soma=soma+n[i];
			i++;
		}
	
		media=(double)soma/10;
				
			System.out.println("A m�dia �: "+media);
	
		entrada.close();

	}

}
