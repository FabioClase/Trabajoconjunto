package bucle;
import java.util.Scanner;

public class Actividad23 {
		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			int numero;
			int contador=0;
			int suma=0;
			double media=0.0;
			System.out.println("vamos a calcular la media de 10 numeros:");			
			while(contador<10) {
				System.out.println("introduce un numero: ");
				numero=entrada.nextInt();
				suma=suma+numero;
				contador=contador+1;				
			}
			media=(double)suma/10;
			//media=suma/10.0;
			System.out.println("la media es:" +media);
		}
}
