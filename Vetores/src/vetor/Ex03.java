package vetor;

public class Ex03 {
	public static void main(String[] args) {
		int vetor1[] = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
		int vetor2[] = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
		int vetorResultante[] = new int[vetor1.length+vetor2.length];

		for (int i =0; i<(vetorResultante	.length); i++){
			if (i%2==0){
				vetorResultante[i]=vetor1[i];
			}
		}
		for (int i =0; i<(vetorResultante.length); i++){
			if (i%2!=0){
				vetorResultante[i]=vetor1[i];
			}
		}
		
		for (int i=0;i<vetorResultante.length;i++){
			System.out.println(vetorResultante[i]);
		}
	}
}
