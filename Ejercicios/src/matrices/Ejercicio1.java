package matrices;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TAM=4;
		int numeros[]=new int[TAM];
		int pos;
		
		for(pos=0;pos<TAM;pos++) {
				System.out.println("introduce un numero: ");
				numeros[pos]=entrada.nextInt();
		}
		for(pos=0;pos<TAM;pos++) {
			System.out.println("numero: "+numeros[pos]);
		}
	}

}
