package lista3;
import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int qtdNasc,i,tempoVida;
		char sexo;
		
		i=0;
		qtdNasc=0;
		tempoVida=0;
		sexo='\u0000';
		
		System.out.println("Insira o número de crianças nascidas no período: ");
		qtdNasc = entrada.nextInt();
		
		
		while (i!=qtdNasc){
			System.out.println("Insira o sexo da criança: M- Masculino; F- Feminino: ");
			sexo = entrada.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			
			if(sexo=='M'){
				totM++;
			}else if(sexo=='F')
			
			System.out.println("Insira o tempo de vida da criança: ");
			tempoVida = entrada.nextInt();
		
		}
		
		
		entrada.close();
	}
}
