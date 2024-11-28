package bucle;
	import java.util.Scanner;
public class Actiidad40_1 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int numeros;
		
		System.out.println("escribe un numero para que adivines: ");
		num = entrada.nextInt();
		do {
			System.out.println("escribe un numero: ");
			numeros = entrada.nextInt();
			if(numeros!=num && numeros<num) {
			System.out.println("el numero es menor, vuelvelo a intentar");
			} else {
			System.out.println("el numero es mayor, vuelvelo a intentar");
			}
		} while (numeros!=num);
		
		System.out.println("acertaste  ");
		
		}
}
