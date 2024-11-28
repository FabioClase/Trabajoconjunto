package bucle;
import java.util.Scanner;
public class Actividad52 {
 
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		float media=0;
		int positivos=0;
	for (int cont=0; cont<10; cont=cont+1) {
			System.out.println("escribe un numero: ");
			num = entrada.nextInt();

				if (num<=10 || num>=50) {
				System.out.println("el numero es menor que 10 y mayor que 50");
				}else {
					System.out.println("error");
				}
				//media=positivos/cont;
			
	}
 
}
}
