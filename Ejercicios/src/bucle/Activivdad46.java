package bucle;
	import java.util.Scanner;
public class Activivdad46 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		int si=0;
		for (int cont=0; cont<10; cont=cont+1) {
		System.out.println("escribe un numero:");
		num=entrada.nextInt();
		if(num>8) {
			System.out.println("es mayor que 8");
			si=si+1;
		} else {
			System.out.println("es menor que 8");
		}
		}
		System.out.println(+si+ " numeros han sido mayores que 8");
	}

}
