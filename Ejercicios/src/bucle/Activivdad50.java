package bucle;
	import java.util.Scanner;
public class Activivdad50 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		int num;
		int resto=0;
		int suma=0;
		
		do {
		System.out.println("escribe un numero: ");
		num=entrada.nextInt();
		resto=num%2;
		}while(resto==0);
		
		for (int impar=1;impar<=num; impar=impar+2) {
			System.out.println("impar " +impar);
		}
		
	}
}
