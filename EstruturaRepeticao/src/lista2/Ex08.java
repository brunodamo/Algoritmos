package lista2;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tipo,codigo,i;
		double invest,rendimento,somaInv,somaJur,somaRend;
		
		i=0;
		codigo=-1;
		tipo=0;
		invest=0;
		rendimento=0;
		somaInv=0;
		somaJur=0;
		somaRend=0;
		
		while (codigo!=0) {
			System.out.println("Insira o código do cliente: ");
			codigo = entrada.nextInt();			
			System.out.println("Insira o tipo da conta: "+ "\n" + "1- Poupança" + "\n" + "2 - Poupança Plus" + "\n" + "3 - Renda Fixa");
			tipo = entrada.nextInt();	
			System.out.println("Insira o valor investido: ");
			invest = entrada.nextDouble();
			
			
			if (codigo!=0){
				System.out.println("Insira o tipo da conta: "+ "\n" + "1- Poupança" + "\n" + "2 - Poupança Plus" + "\n" + "3 - Renda Fixa");
				tipo = entrada.nextInt();	
				System.out.println("Insira o valor investido: ");
				invest = entrada.nextDouble();
				if (tipo==1){
					rendimento=0.015;
				}else if (tipo==2){
					rendimento=0.02;
				}else if(tipo==3){
					rendimento=0.04;
				}else{
					System.out.println("Insira um tipo de conta válido !");
				}
				i++;
				somaInv=somaInv+invest;
				somaRend=somaRend+invest+(1*rendimento);
				somaJur=somaJur+somaRend-invest;
			}	
			
					
					
		}	
			System.out.println("O total investido é: "+somaInv);
			System.out.println("O total de juros pagos é: "+somaJur);
			System.out.println("O número de clientes é: "+i);
			
			entrada.close();
	}

}
