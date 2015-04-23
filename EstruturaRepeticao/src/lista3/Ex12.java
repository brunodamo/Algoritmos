package lista3;
import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int qtdMortes,i,tempoVida,totM,totF,tot24;
		char sexo;
		double pctF,pctM,pct24;
		
		i=0;
		qtdMortes=0;
		tempoVida=0;
		sexo='\u0000';
		totM=0;
		totF=0;
		tot24=0;
		pctF=0;
		pctM=0;
		pct24=0;
		
		System.out.println("Insira o número de crianças nascidas no período: ");
		qtdMortes = entrada.nextInt();
		
		
		while (i!=qtdMortes){
			i++;
	
			System.out.println("Insira o sexo da " + i + " ª criança: M- Masculino; F- Feminino: ");
			sexo = entrada.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			
			if(sexo=='M'){
				totM++; 	
			}else if(sexo=='F'){
				totF++;
			}else{
				System.out.println("Insira um sexo válido !");
			}
			
			System.out.println("Insira o tempo de vida da " + i + " ª criança (em meses): ");
			tempoVida = entrada.nextInt();
			
			if (tempoVida<=24) {
				tot24++;
			}
			
		}
		
		if (i!=0){
		pctF=(double)totF/i;
		pctM=(double)totM/i;
		pct24=(double)tot24/i;
		}
		
		System.out.println("A porcentagem de crianças mortas do sexo feminino é: "+pctF+"%");
		System.out.println("A porcentagem de crianças mortas do sexo masculino é: "+pctM+"%");
		System.out.println("A porcentagem de crianças mortas com até 24 meses de vida é: "+pct24+"%");
		
		entrada.close();
	}
}
