package bucle;
 
import java.util.Scanner;
 
public class Actividad49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num1;
		int num2;
		do {
		System.out.println("escribe 2 numeros :");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		if (num1==num2) {
		System.out.println("son iguales:");
		} else {
		System.out.println("no son iguales:");
			if (num1>num2) {
				System.out.println(+num1+ " es mayor");
			}else {
				System.out.println(+num2+ " es mayor");
		}
		}
		}while(num1==num2);
		
		
	}
}
 
 