package bucle;
	import java.util.Scanner;
public class Actividad30 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		int num;
		for (int cont=0;cont<6;cont=cont+1) {
			System.out.print("escribe un numero:");
			num=entrada.nextInt();
			suma=suma+num;
		}
		System.out.println("la suma es:" +suma);
	}
}
