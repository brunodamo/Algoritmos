package vetor;

public class Ex03 {
	public static void main(String[] args) {
		int vetor1[] = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
		int vetor2[] = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
		int vetorResultante[] = new int[vetor1.length+vetor2.length];
		int aux =0;
		
		for (int i =0; i<vetor1.length; i++){
			vetorResultante[aux] = vetor1[i];
			aux++;
			vetorResultante[aux] = vetor2[i];
			aux++;
		}
		
		for (int i=0;i<vetorResultante.length;i++){
			System.out.print("["+vetorResultante[i]+ (i+1 == vetorResultante.length? "]." : "],"));
		}
	}
}
