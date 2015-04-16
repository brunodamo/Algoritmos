package fixacao;
import java.util.Scanner;

public class Ex05 {
	
public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	int soma,id,optA,optB,optC,optD,optE,i;
	double media,pctA,pctB,pctC,pctD,pctE;
	String op;
	
	i=-1;
	id=-1;
	soma=0;
	optA=0;
	optB=0;
	optC=0;
	optD=0;
	optE=0;
	media=0;
	pctA=0;
	pctB=0;
	pctC=0;
	pctD=0;
	pctE=0;
	op=null;
	
	while(id!=0){
		System.out.println("Insira a idade");
		id=entrada.nextInt();
		
		i++;
		soma=soma+id;
		
	
		
		do{
			System.out.println("Insira a opinião");
			op=entrada.next();
			if (op.equalsIgnoreCase("A")){
				optA++;
			}else if (op.equalsIgnoreCase("B")){
				optB++;
			}else if (op.equalsIgnoreCase("C")){
				optC++;
			}else if (op.equalsIgnoreCase("D")){
				optD++;
			}else if (op.equalsIgnoreCase("E")){
				optD++;
			}else{
				System.out.println("Escolha uma opinião válida");
			}
		} while((! op.equalsIgnoreCase("A")) && (! op.equalsIgnoreCase("B")) && (! op.equalsIgnoreCase("C")) && (! op.equalsIgnoreCase("D")) && (! op.equalsIgnoreCase("E")));
		 
	}
	
	if (i!=0){
		media=soma/i;
		pctA=(double)optA/i;
		pctB=(double)optB/i;
		pctC=(double)optC/i;
		pctD=(double)optD/i;
		pctE=(double)optE/i;
	}
		System.out.println("Quantidade de pessoas que responderam a pesquisa: "+i);
		System.out.println("Média de idade das pessoas que responderam a pesquisa: "+media);
		System.out.println("Porcentagem de opinião A: "+pctA);
		System.out.println("Porcentagem de opinião B: "+pctB);
		System.out.println("Porcentagem de opinião C: "+pctC);
		System.out.println("Porcentagem de opinião D: "+pctD);
		System.out.println("Porcentagem de opinião E: "+pctE);
		
		entrada.close();
}
}
