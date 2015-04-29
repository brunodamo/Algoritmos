package lista3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		DecimalFormat numFormat = new DecimalFormat("#,##0.00");

		int i,normal,barato,caro;
		double totImposto,precoUnit,estocagem,imposto,precoFinal,maiorPreco,menorPreco,adicional;
		char categ,refri;
		String msg;

		i = 0;
		precoUnit = 0;
		estocagem = 0;
		refri = '\u0000';
		categ = '\u0000';
		imposto = 0;
		precoFinal=0;
		msg=null;
		maiorPreco=precoFinal;
		menorPreco=precoFinal;
		totImposto=0;
		normal=0;
		barato=0;
		caro=0;
		adicional=0;

		while (i<13){
			i++;
			System.out.println("Insira o preço unitário do "+ i + " produto: ");
			precoUnit=entrada.nextDouble();
			System.out.println("Insira a necessidade de refrigeração: \n S- Necessita de Refrigeração \n N- não necessita de refrigeração");
			while ((refri!='N') && (refri!='S')){	
				refri=entrada.next().charAt(0);
				refri = Character.toUpperCase(refri);
				System.out.println("Insira uma refrigeração válida!");
			}
			System.out.println("Insira a categoria do produto: \n A- Alimentação \n L- Limpeza \n V- Vestuário");
			while ((categ!='A') && (categ!='L') && (categ!='V')){
				categ=entrada.next().charAt(0);
				categ=Character.toUpperCase(categ);
				System.out.println("Insira uma categoria válida!");
			}

			if (precoUnit < 20) {
				if (categ=='A') {
					estocagem = 2;
				}else if (categ=='L'){
					estocagem = 3;
				}else if (categ=='V'){
					estocagem = 4;
				}				
			}else if ((precoUnit>20) && (precoUnit<=50)){
				if (refri=='S'){
					estocagem = 6;
				}else if (refri=='N'){
					estocagem = 0;
				}else{
					if (refri=='S'){
						if (categ=='A'){
							estocagem=5;
						}else if (categ=='L'){
							estocagem=2;
						}else if (categ=='V'){
							estocagem = 4;
						}
					}else if (refri=='N'){
						if ((categ=='A') || (categ=='V')){
							estocagem=0;
						}else if (categ=='L'){
							estocagem=1;
						}
					}
				}
			}

			if ((categ=='A') && (refri=='S')){
				imposto=precoUnit*0.4;
			}else{
				imposto=precoUnit*0.02;
			}

			totImposto=imposto+totImposto;

			precoFinal=precoUnit+estocagem+imposto;

			if (precoFinal<20){
				msg="Barato";
				barato++;
			}else if ((precoFinal>=20) && (precoFinal<=100)){
				msg="Normal";
				normal++;
			}else{
				msg="Caro";
				caro++;
			}

			System.out.println("Custo de Estocagem: "+estocagem+" Custo de imposto: "+imposto+ "Preço Final: "+precoFinal+ "Classificacao: "+msg);

			adicional=adicional+estocagem+imposto;

			if (i==1){
				menorPreco=precoFinal;
			}else if (menorPreco>precoFinal){
				menorPreco=precoFinal;
			}

			if (maiorPreco<precoFinal){
				maiorPreco=precoFinal;
			}

		}
		entrada.close();
		System.out.println("Média dos valores: "+adicional/2);
		System.out.println("Maior Preço: "+maiorPreco);
		System.out.println("Menor Preço: "+menorPreco);
		System.out.println("Total dos impostos: "+totImposto);
		System.out.println("A quantidade de produtos baratos: "+barato);
		System.out.println("A quantidade de produtos normais: "+normal);
		System.out.println("A quantidade de produtos caros: "+caro);
	}
}