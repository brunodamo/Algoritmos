package listaExtra;
import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double[] totalVendas = new double[10];
		double[] comissao = new double[10];
		String[] vendedor = new String[10];
		int i =0;
		double maiorValor=0, menorValor=0,geralVendas=0;
		String maiorVendedor=null, menorVendedor=null;
		
		for (i=0;i<10;i++){
			System.out.println("Insira o nome do vendedor: ");
			vendedor[i] = entrada.next();
			System.out.println("Insira o total de vendas:");
			totalVendas[i] = entrada.nextDouble();
			System.out.println("Insira a porcentagem da comissao do vendedor: ");
			comissao[i] = entrada.nextDouble();
			geralVendas+=totalVendas[i];
		}
		
		for (i=0;i<10;i++){
			if (i==0){
				maiorValor=totalVendas[i]*comissao[i]/100;
				maiorVendedor=vendedor[i];
			}else if (maiorValor<totalVendas[i]){
				maiorValor=totalVendas[i]*comissao[i]/100;
				maiorVendedor=vendedor[i];
			}
			if (i==0){
				menorValor=totalVendas[i]*comissao[i]/100;
				menorVendedor=vendedor[i];
			}else if (menorValor>totalVendas[i]){
				menorValor=totalVendas[i]*comissao[i]/100;
				menorVendedor=vendedor[i];
			}
		}
		
		System.out.println("Relatorio: ");
		for (i=0;i<10;i++){
			System.out.println("Nome do vendedor: "+vendedor[i]+" Comisssao total: "+(comissao[i]/100*totalVendas[i]));
		}
		System.out.println("O total das vendas de todos vendedores foi de: "+ geralVendas);
		System.out.println("O maior valor foi: "+maiorValor+" e foi obtido por: "+maiorVendedor);
		System.out.println("O menor valor foi: "+menorValor+" e foi obtido por: "+menorVendedor);
		
		
		entrada.close();

	}

}
