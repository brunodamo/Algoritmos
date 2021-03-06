package nac_03;

import java.util.Scanner;
import java.text.DecimalFormat;
public class BrunoDamo_73871 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formata = new DecimalFormat("R$ ###0.00");
		
		
		int cpf=0,codigo=-1,qtd=0,iqtd=0,i=1,parcela=2,numParcelas=0,iVista=0,iPrazo=0;
		double valor=0,total=0,totalParcela=0;
		String condicao = null;
		char venda='S';
		
		
		while (venda=='S'){
			System.out.println("_________Venda n�"+i+"_________");
			System.out.println("Digite o CPF do cliente: ");
			cpf = entrada.nextInt();
			
			while (codigo!=0){
					System.out.println("Digite o c�digo do produto: ");
					codigo = entrada.nextInt();
				if (codigo!=0){
					System.out.println("Digite o valor do produto: ");
					valor = entrada.nextDouble();
					System.out.println("Digite a quantidade do produto: ");
					qtd = entrada.nextInt();
					total+=valor*qtd;
					iqtd+=qtd;
				}
			}
			System.out.println("Dados da compra");
			System.out.println("Total de itens: "+iqtd);
			System.out.println("Total da compra"+formata.format(total));
			
			System.out.println("Digite a forma de Pagamento: FV - Vista e FP - Prazo");
			condicao = entrada.next();
			while  ((condicao.equalsIgnoreCase(condicao) != condicao.equalsIgnoreCase("FV")) && (condicao.equalsIgnoreCase(condicao) !=condicao.equalsIgnoreCase("FP"))){
				System.out.println("Insira uma forma de pagamento inv�lida !");
				System.out.println("Digite a forma de Pagamento: FV - Vista e FP - Prazo");
				condicao = entrada.next();
			}
			if (condicao.equalsIgnoreCase("FV")){
				total=total*0.95;
				System.out.println("Valor Final: "+formata.format(total));
				iVista++;
			}else{
				for (parcela=2;parcela<14;parcela+=2){
					totalParcela=total+(total*parcela/100);
					System.out.println("O pre�o final parcelado em "+parcela+"X � de "+formata.format(totalParcela)+" com parcelas de "+formata.format(totalParcela/parcela));
				}
				System.out.println("Digite o n�mero de parcelas: ");	
				numParcelas=entrada.nextInt();
				iPrazo++;
			}
			
				
			System.out.println("Deseja cadastrar uma nova venda ? S- Sim, N- N�o");
			venda=entrada.next().charAt(0);
			venda=Character.toUpperCase(venda);
			while ((venda!='S') && (venda!='N')){
				System.out.println("Insira uma forma de pagamento inv�lida !");
				System.out.println("Deseja cadastrar uma nova venda ? S- Sim, N- N�o");
				venda=entrada.next().charAt(0);
				venda=Character.toUpperCase(venda);
			}
			if (venda=='N'){
				System.out.println("RELAT�RIO FINAL MAGAZINE LUIZA");
				System.out.println("N�mero de vendas realizadas: "+i);
				System.out.println("N�mero de vendas � Vista: "+iVista*100/i+"%");
				System.out.println("N�mero de vendas � Prazo: "+iPrazo*100/i+"%");
			}
				
			codigo=-1;
			iqtd=0;
			total=0;
			i++;
		}
		
		
		
		entrada.close();
	}

}
