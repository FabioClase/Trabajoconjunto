package bucle;
	import java.util.Scanner;
public class Actividad43 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int num,i,j;
		System.out.println("introduce un numero entero");
		num=entrada.nextInt();
		for(i=1;i<=num;i++) {
			for(j=1;j<=num;j++)
				System.out.print("* ");
			System.out.println();
		}
		entrada.close();
	}
}