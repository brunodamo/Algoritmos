package fixacao;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[]arrayNome = new String[5];
		
		int i=0;
		
		while (i<5){
			System.out.println("Insira o nome da pessoa: ");
			arrayNome[i] = entrada.next();
			i++;
		}	
		
		for (i=0;i<5;i++){
		System.out.println("O nome "+(i+1)+" foi: "+arrayNome[i]);
		}
		
		entrada.close();
	}
}
