package lista4;
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int iLoc=0,iDVD=0,codCliente=0,codDVD=0,codMaior=0,codMenor=0;
		double valor=0,valorLoc=0,desconto=0,valorFinal=0,valorGeral=0,menorLoc=0,maiorLoc=0;
		char tipoDVD,respLocacao='S',respDVD='S';

		while (respLocacao=='S'){
			iLoc++;
			System.out.println("Insira o c�digo do cliente: ");
			codCliente = entrada.nextInt();

			while(respDVD=='S'){
				iDVD++;
				System.out.println("Insira o c�digo do DVD (N�mero entre 1 e 20)");
				codDVD = entrada.nextInt();

				while ((codDVD<1)||(codDVD>20)){
					System.out.println("Insira um c�digo de DVD v�lido!");
					System.out.println("Insira o c�digo do DVD (N�mero entre 1 e 20)");
					codDVD = entrada.nextInt();
				}

				System.out.println("Insira o tipo de DVD: A- A��o; C- Com�dia; D- Drama: ");
				tipoDVD=entrada.next().charAt(0);
				tipoDVD=Character.toUpperCase(tipoDVD);
				while ((tipoDVD!='A')&&(tipoDVD!='C')&&(tipoDVD!='D')){
					System.out.println("Insira um tipo de DVD v�lido!");
					System.out.println("Insira o tipo de DVD: A- A��o; C- Com�dia; D- Drama: ");
					tipoDVD=entrada.next().charAt(0);
					tipoDVD=Character.toUpperCase(tipoDVD);
				}

				if((codDVD>0)&&(codDVD<11)){
					if(tipoDVD=='A'){
						valor=8;
					}else if(tipoDVD=='C'){
						valor=12;
					}else{
						valor=10;
					}
				}else{
					if(tipoDVD=='A'){
						valor=5;
					}else if (tipoDVD=='C'){
						valor=7;
					}else{
						valor=9;
					}
				}

				valorLoc=valorLoc+valor;


				System.out.println("Deseja alugar outro DVD ?");
				respDVD= entrada.next().charAt(0);
				respDVD=Character.toUpperCase(respDVD);


			}

			if (iDVD>=4){
				desconto=0.05;
			}

			valorFinal=valorLoc-(valorLoc*desconto);
			valorGeral=valorFinal+valorGeral;
			
			if(iLoc==1){
				menorLoc=valorFinal;
				codMenor=codCliente;
			}else{
				if (menorLoc>valorFinal){
					menorLoc=valorFinal;
					codMenor=codCliente;
				}
			}

			if(maiorLoc<valorFinal){
				maiorLoc=valorFinal;
				codMaior=codCliente;
			}
			
			System.out.println("N�mero de DVDs: "+iDVD+"\n Valor da Loca��o: "+valorLoc+"\n Valor Final: "+valorFinal);


			valorLoc=0;
			valorFinal=0;
			iDVD=0;
			respDVD='S';
			


			System.out.println("Deseja realizar outra loca��o ?");
			respLocacao=entrada.next().charAt(0);
			respLocacao=Character.toUpperCase(respLocacao);
		}

		System.out.println("Numero total de Loca��es: "+iLoc);
		System.out.println("Valor Total das Loca��oes: "+valorGeral);
		System.out.println("Cliente com maior loca��o: "+codMaior+" Valor Locado: R$"+maiorLoc);
		System.out.println("Cliente com menor loca��o: "+codMenor+" Valor Locado: R$"+menorLoc);

		entrada.close();
	}
}
