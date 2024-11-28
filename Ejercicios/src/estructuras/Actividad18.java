package estructuras;
import java.util.Scanner;
public class Actividad18 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		//entrada:leemos entero
		System.out.println("introduce un entero");
		num1=entrada.nextInt();
		System.out.println("introduce un entero");
		num2=entrada.nextInt();
		System.out.println("introduce un entero");
		num3=entrada.nextInt();
		
		//proceso y salida
		if (num1<=num2 && num1<=num3)
			System.out.println("el numero menor es:" +num1);
		else {
			if (num2<=num1 && num2<=num3)
				System.out.println ("el numero menor es:" +num2);
			else 
				System.out.println ("el numero menor es:" +num3);
		}
	}
}