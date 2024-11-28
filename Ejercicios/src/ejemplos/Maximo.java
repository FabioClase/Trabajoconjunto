package ejemplos;
	import java.util.Scanner;
public class Maximo {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
	//pide numeros enteros y que cuando aparezca un 0 deje de pedir nuemeros y escriba el maximo de los nuemros
		int num;
		int max=0;
		do {
		System.out.println("introduce un numero entero:");
			num = entrada.nextInt();
			if (num>max) {
			max=num;
		}else {
				num=num;
			}			
		}while (num!=0);
		System.out.println("el numero maximo que has introducido es: "+max);
	}
}
