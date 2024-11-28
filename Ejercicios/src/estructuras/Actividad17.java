package estructuras;
import java.util.Scanner;
public class Actividad17 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		
		//entrada:leemos entero
		System.out.println("introduce un entero");
		num=entrada.nextInt();
		
		//proceso y salida
		if (num==0)
			System.out.println("es 0");
		else {
			if (num%2==0)
			System.out.println("es par");
			else 
			System.out.println("es impar");
	}
	entrada.close();
	}
}
