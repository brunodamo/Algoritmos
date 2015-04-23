package lista3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex13 {
	
	public static void main(String[] args) {
	 Scanner entrada = new Scanner (System.in);
	 DecimalFormat numFormat = new DecimalFormat ("#,##0.00");
	 
	 int qtdParcela;
	 double valorDivida,valorJuros,valorParcela,pctJuros,valorAcumul;
	 
	 qtdParcela=1;
	 valorDivida=0;
	 valorJuros=0;
	 valorParcela=0;
	 pctJuros=10;
	 valorAcumul=0;
	 
	 System.out.println("Insira o valor da dívida");
	 valorDivida = entrada.nextDouble();
	 
	 valorParcela=valorDivida;
	 
	 System.out.println("O valor da dívida é: R$" + numFormat.format(valorDivida) + " O valor dos juros é: R$" + numFormat.format(valorJuros) + " A quantidade de parcelas é: "+qtdParcela+ " O valor da parcela é: R$" + numFormat.format(valorParcela));
	 
	 for (qtdParcela=3;qtdParcela<15;qtdParcela+=3){
		 if (qtdParcela==3){
			 pctJuros=0.10;
		 }else{
			 pctJuros+=0.05;
		 }
		 
		 valorJuros = (valorDivida*pctJuros);
		 valorAcumul = valorDivida+valorJuros;
		 valorParcela = valorAcumul/qtdParcela;
	
		
		
		 System.out.println("O valor da dívida é: R$" + numFormat.format(valorAcumul) + " O valor dos juros é: R$" + numFormat.format(valorJuros) + " A quantidade de parcelas é: "+qtdParcela+ " O valor da parcela é: R$" + numFormat.format(valorParcela));
	 }
	 
	 entrada.close();
	}
}
