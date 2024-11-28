package bucle;
	import java.util.Scanner;
public class Actividad39 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int cont=0;
		int num;
		do {
			cont=cont+1;
			System.out.println("escribe un numero: ");
			num=entrada.nextInt();
			if (num>=0) {
				System.out.println("el numero es positivo:" +num);
		}else
			System.out.println("el numero es negativo:" +num);
		}while (cont<10);
	}
}
