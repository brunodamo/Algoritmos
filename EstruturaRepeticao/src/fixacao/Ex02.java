package fixacao;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int i, idade,faixa1,faixa2,faixa3,faixa4,faixa5;
		double pct1,pct2,pct3,pct4,pct5;
		
		Scanner entrada =new Scanner(System.in);
		
		i=0;
		idade=0;
		faixa1=0;
		faixa2=0;
		faixa3=0;
		faixa4=0;
		faixa5=0;
		pct1=0;
		pct2=0;
		pct3=0;
		pct4=0;
		pct5=0;
		
		while (i<20){
			System.out.println("Insira a idade: ");
			idade=entrada.nextInt();
			
			i++;
			
			if (idade<=15){
				faixa1++;
			}else if ((idade>=16) && (idade<=30)){
				faixa2++;
			}else if ((idade>=31) && (idade<=45)){
				faixa3++;
			}else if ((idade>=46) && (idade<=60)){
				faixa4++;
			}else{
				faixa5++;
			}
			
		}
		if (i!=0){
			pct1=faixa1/i;
			pct2=faixa2/i;
			pct3=faixa3/i;
			pct4=faixa4/i;
			pct5=faixa5/i;
		}
		System.out.println("Quantidade 1:"+faixa1);
		System.out.println("Quantidade 2:"+faixa2);
		System.out.println("Quantidade 3:"+faixa3);
		System.out.println("Quantidade 4:"+faixa4);
		System.out.println("Quantidade 5:"+faixa5);
		System.out.println("Porcentagem 1:"+pct1);
		System.out.println("Porcentagem 2:"+pct2);
		System.out.println("Porcentagem 3:"+pct3);
		System.out.println("Porcentagem 4:"+pct4);
		System.out.println("Porcentaaem 5:"+pct5);
		
		entrada.close();
		
	}
}
