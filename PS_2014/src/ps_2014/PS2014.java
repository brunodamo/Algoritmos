package ps_2014;
import java.util.Scanner;

public class PS2014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		int i=1,codigo=0,categ=0,qtdIngressos=0,qtdTotal=0,pgto=0,parcelas=0;
		String nome=null;
		double valor=0,valorCompra=0,valorTotal=0;
		char respJogo='S',respVenda='S';

		while (respVenda=='S'){
			System.out.println("-------"+i+"ª venda-------");
			System.out.println("Insira o nome do cliente: ");
			nome = entrada.next();

			while (respJogo=='S'){
				System.out.println("Insira o código do jogo: ");
				codigo = entrada.nextInt();
				while ((codigo<1) || (codigo>7)){
					System.out.println("Código inválido, insira um código entre 1 e 7.");
					System.out.println("Insira o código do jogo: ");
					codigo = entrada.nextInt();
				}


				System.out.println("Insira a categoria: ");
				categ = entrada.nextInt();
				while ((categ<1)||(categ>4)){
					System.out.println("Categoria inválida, insira uma categoria entre 1 e 4.");
					System.out.println("Insira a categoria: ");
					categ = entrada.nextInt();
				}

				System.out.println("Insira a quantidade de ingressos desejada:");
				qtdIngressos = entrada.nextInt();

				if (codigo==1){
					if (categ==1){
						valor=990;
					}else if (categ==2){
						valor=660;
					}else if (categ==3){
						valor=440;
					}else{
						valor=160;
					}
				}else if (codigo==2){
					if (categ==1){
						valor=350;
					}else if (categ==2){
						valor=270;
					}else if (categ==3){
						valor=180;
					}else{
						valor=60;
					}
				}else if (codigo==3){
					if (categ==1){
						valor=440;
					}else if (categ==2){
						valor=330;
					}else if (categ==3){
						valor=220;
					}else{
						valor=110;
					}
				}else if (codigo==4){
					if (categ==1){
						valor=660;
					}else if (categ==2){
						valor=440;
					}else if (categ==3){
						valor=330;
					}else
						valor=170;
				}else if (codigo==5){
					if (categ==1){
						valor=1320;
					}else if (categ==2){
						valor=880;
					}else if (categ==3){
						valor=550;
					}else
						valor=220;
				}else if (codigo==6){
					if (categ==1){
						valor=660;
					}else if (categ==2){
						valor=440;
					}else if (categ==3){
						valor=330;
					}else
						valor=170;
				}else{
					if (categ==1){
						valor=1980;
					}else if (categ==2){
						valor=1320;
					}else if (categ==3){
						valor=880;
					}else
						valor=330;
				}
				valorCompra = valor*qtdIngressos;
				System.out.println("Valor: R$"+valorCompra);

				
				System.out.println("Deseja comprar mais ingressos ?");
				respJogo = entrada.next().charAt(0);
				respJogo = Character.toUpperCase(respJogo);
				
				valorTotal+=valorCompra;
				qtdTotal+=qtdIngressos;
				qtdIngressos=0;
				valorCompra=0;
			}
			System.out.println("Dados da "+i+"ª venda");
			System.out.println("Nome do cliente: "+nome);
			System.out.println("Quantidade de Ingressos: "+qtdTotal+" - Valor R$: "+valorTotal);
			
			System.out.println("Formas de Pagamento: ");
			System.out.println("1 - Pagamento à Vista");
			System.out.println("2 - Pagamento parcelado");
			System.out.println("Insira a forma de pagamento: ");
			pgto=entrada.nextInt();
			
			if (pgto==1){
				System.out.println("Valor final: R$"+valorTotal*0.95);
			}else{
				System.out.println("Insira o número de parcelas: ");
				parcelas=entrada.nextInt();
				while ((parcelas>10) && (parcelas<1)){
					
				}
			}
			
			
			respJogo='S';
			i++;
		}




		entrada.close();
	}

}
