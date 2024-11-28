package matrices;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("introduce cuatos numeros vas a esribir: ");
		num=entrada.nextInt();		
		
		int matriz[]=new int[num];
		int pos;
		
		
		for(pos=0;pos<num;pos++) {
			System.out.println("introduce numeros: ");
			matriz[pos]=entrada.nextInt();
		}
		
		for(pos=0;pos<num;pos++)
			System.out.println("numero: "+matriz[pos]);
	}

}
