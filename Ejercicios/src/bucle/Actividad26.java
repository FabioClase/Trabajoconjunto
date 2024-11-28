package bucle;
	import java.util.Scanner;
public class Actividad26 {
	public static void main(String [] args) {
		Scanner entrada=new Scanner(System.in);
	int num;
	do {
		System.out.println("introduce un numero: ");
		num=entrada.nextInt();
	}while (num<=10);
		System.out.println("el numero es mayor o igual que 10asi que acaba: " +num);
	}
	}
