package lista1;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int[]n = new int[6];
		int par=0,impar=0,i=0;
		
		for (i=0;i<6;i++){
			System.out.println("Digite um n�mero: ");
			n[i]=entrada.nextInt();
			if (n[i]%2==0){
				System.out.println("O n�mero "+n[i]+" � par!");
				par++;
			}else{
				System.out.println("O n�mero "+n[i]+" � impar!");
				impar++;
			}
		}
		
		System.out.println("Quantidade de n�meros pares: "+par);
		System.out.println("Quantidade de n�meros �mpares: "+impar);		
		entrada.close();
	}

}
