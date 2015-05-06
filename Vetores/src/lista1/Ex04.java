package lista1;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[]nome = new String[10];
		int i=0;
		String procura=null;
		
		for (i=0;i<10;i++){
			System.out.println("Digite o "+(i+1)+" nome:");
			nome[i]=entrada.next();
		}
		
		System.out.println("Digite o nome para procurar no vetor:");
		procura=entrada.next();
		
		
		for(i=0;i<10;i++){
			if (nome[i].equalsIgnoreCase(procura)){
			 System.out.println("Achei! - posição: "+(i+1));	
			}else{
				System.out.println("Não achei");
			}
		}
		
		entrada.close();
	}
}
