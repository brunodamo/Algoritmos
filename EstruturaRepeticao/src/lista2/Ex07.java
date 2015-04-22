package lista2;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int cont4,cont5,cont7,cont12,i,numCanal,pessoas4,pessoas5,pessoas7,pessoas12;
		double pctAud;
		
		i=0;
		numCanal=0;
		pctAud=0;
		cont4=0;
		cont5=0;
		cont7=0;
		cont12=0;
		pessoas4=0;
		pessoas5=0;
		pessoas7=0;
		pessoas12=0;
		
		System.out.println("CANAIS: ");
		System.out.println("4- SBT");
		System.out.println("5- Globo");
		System.out.println("7- Record");
		System.out.println("12- Band");
		
		while(numCanal!=0){
			System.out.println("Insira o canal que você está assitindo");
			numCanal=entrada.nextInt();
			if ((numCanal!=0)&&(numCanal!=4)&&(numCanal!=5)&&(numCanal!=7)&&(numCanal!=12)){
				System.out.println("Insira um canal correto !");				
			}
			
			
		}
		
		entrada.close();
	}

}
