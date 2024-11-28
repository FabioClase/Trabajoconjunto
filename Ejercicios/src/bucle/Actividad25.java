package bucle;
	import java.util.Scanner;
public class Actividad25 {
	public static void main(String [] args) {
		Scanner entrada=new Scanner(System.in);
	int numero;
	int resto;
	
		System.out.println("dime numeros y les ire leyendo");
		System.out.println("introduce un numero par:");
		numero= entrada.nextInt();
		resto=numero%2;
	if (resto==0) 
		System.out.println("el numero es par:");
	else {
		while (resto!=0) {
			System.out.println("el numero es: "+numero);
			System.out.println("continua diciendome numeros. Para terminar introduce un par");
			numero=entrada.nextInt();
			resto=numero%2;
		}
		System.out.println("el numero es par");
		entrada.close();
	}	
}
}
