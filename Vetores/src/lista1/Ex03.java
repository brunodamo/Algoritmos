package lista1;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Float[]temperatura = new Float[7];
		int i=0,acima=0;
		float soma=0,media=0;
		
		for(i=0;i<7;i++){
			System.out.println("Insira a temperatura do "+(i+1)+" dia");
			temperatura[i] = entrada.nextFloat();
			
			soma+=temperatura[i];
		}
		
		media=soma/7;
		
		
		for (float tempo :  temperatura){
			if (tempo>media){
				acima++;
			}
		}
		/*for (i=0;i<7;i++){
			if (temperatura[i]>media){
				acima++;
			}
		}
		*/
		
		System.out.println("A m�dia da temperatura na semana foi: "+media);
		System.out.println("A quantidade de dia(s) com temperatura acima da m�dia:"+acima);
		
		entrada.close();
	}
}
