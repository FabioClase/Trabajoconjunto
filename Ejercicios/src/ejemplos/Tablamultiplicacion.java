package ejemplos;
	import java.util.Scanner;
public class Tablamultiplicacion {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		//lea un numero y con ese numero haga la tabla de multiplicar de ese numero
		int num;
		int mult;
		do {
		System.out.println("escribe un numero: ");
		num = entrada.nextInt();
			for(int contador=1 ;num>=1 && num<=10;contador=contador+1) {
				System.out.println("escribe un numero: ");
				mult=num+contador;
				System.out.println(+mult);
				}
			}while (num<=10 && num>=1);

	}
}