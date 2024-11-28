package bucle;
 	import java.util.Scanner;
public class Actividad29 {
	public static void main(String [] args) {
		Scanner lista = new Scanner(System.in);
		String frase;
		for(int cont=0;cont<4;cont=cont+1) {
			System.out.println("escribe una frase");
			frase = lista.nextLine();
			System.out.println("la frase es:" +frase);
		}
	}
}
