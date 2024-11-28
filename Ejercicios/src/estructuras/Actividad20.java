package estructuras;
import java.util.Scanner;

public class Actividad20 {
		public static void main(String [] args) {
				Scanner entrada=new Scanner(System.in);
				int numero;

				System.out.println("Introduce un numero del 1 al 7:");
				numero=entrada.nextInt();
				
				switch (numero) {
					case 1,2,3,4,5:
						System.out.println("es lavorable");
						break;
					case 6,7:
						System.out.println("es festivo");
						break;
					default:
						System.out.println("El valor introducido no es el correcto, introduce un valor del 1 al 7:");
						break;
					}	
			}
}