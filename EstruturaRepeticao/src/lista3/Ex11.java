package lista3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat ("#,##0.00");
		
		int i,parcela;
		double valorCarro,valorDesc,total;
		
		i=0;
		valorDesc=0;
		valorCarro=0;
		parcela=0;		
			
		System.out.println("Insira o valor do carro: ");
		valorCarro=entrada.nextDouble();
		
		valorDesc=valorCarro*0.8;
		
		System.out.println("O valor � vista �: "+valorDesc);	
		for (i=6;i<=60;i+=6){
			parcela+=3;
			total=valorCarro+(valorCarro*parcela/100);
			System.out.println("O preco final parcelado em "+i+"X vezes � de "+numFormatado.format(total)+ " com parcelas de R$: "+numFormatado.format(total/i));
			
		}
		entrada.close();
	}
}