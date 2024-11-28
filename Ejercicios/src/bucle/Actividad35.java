package bucle;
import java.util.Scanner;
public class Actividad35 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
 
		do {
			System.out.println("introduce un numero:");
			numero=entrada.nextInt();
			if (numero % 5 == 0 && numero!=5) {
				System.out.println(+numero+ " es multiplo de 5");
				
			}
			
		}while (numero!=5);
		
	}
}
