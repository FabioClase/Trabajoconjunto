package bucle;
	import java.util.Scanner;
public class Actividad24 {
	public static void main(String [] args) {
		Scanner entrada=new Scanner(System.in);
			int numero;
			int producto=1;
			  System.out.println("Vamos a calcular el producto de los numeros hasta que salga un 0:");

			do{
			    System.out.println("introduce un numero: ");
			    numero = entrada.nextInt();
			    producto = producto * numero;
			}while(numero !=0);	
			System.out.println("el producto es: " +producto);
	}
}
