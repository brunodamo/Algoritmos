package fixacao;

import javax.swing.JOptionPane;


public class Ex03 {
	
	public static int cand1;
	public static int cand2;
	public static int cand3;
	public static int cand4;
	public static int cand5;
	public static int nulo;
	public static int branco;
	public static int codigo;
	public static int votos;
	public static String msgOK = "Voto computado com sucesso !";
	public static String msgFail = "Insira um c�digo v�lido !";
	static double pctNulo;
	static double pctBranco;
	
	
	public static void main(String [] args) {
		do {
		 String d_codigo = JOptionPane.showInputDialog("Insira o c�digo do candidato: ");
		 
		 codigo = Integer.parseInt(d_codigo);
		
		 if (codigo==0){
			System.out.println(msgOK);
		  }else if (codigo==1) {
				cand1++;
				votos++;
				System.out.println(msgOK);
				}else if (codigo==2){ 
					cand2++;
					votos++;
					System.out.println(msgOK);
					}else if (codigo==3){
						cand3++;
						votos++;
						System.out.println(msgOK);
						}else if (codigo==4) {
							cand4++;
							votos++;
							System.out.println(msgOK);
							}else if (codigo==5){
								nulo++;
								votos++;
								System.out.println(msgOK);
								}else if(codigo==6){
									branco++;
									votos++;
									System.out.println(msgOK);
									}else{
										System.out.println(msgFail);
										}
		}while (codigo!=0);	
		
		if (votos!=0){
		pctNulo = (double)nulo/votos*100;
		pctBranco = (double)branco/votos*100;
		}
		
		System.out.println("===============");
		System.out.println("Candidato 1: "+ cand1 + " votos.");
		System.out.println("Candidato 2: "+ cand2 + " votos.");
		System.out.println("Candidato 3: "+ cand3 + " votos.");
		System.out.println("Candidato 4: "+ cand4 + " votos.");
		System.out.println("Votos nulos: "+ nulo + " ."); 
		System.out.println("Votos em branco: "+ branco + " .");
		System.out.println("Porcentagem de votos nulos "+ pctNulo + "%");
		System.out.println("Porcentagem de votos em branco: "+ pctBranco + "%");
	}
}

//Daora !
