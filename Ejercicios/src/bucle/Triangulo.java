package bucle;
	import java.util.Scanner;
	public class Triangulo {
		public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int cont;
		//aqui leemos el numero y si no esta entre 1 y 29 vuelve a preguntar otro numero hasta que se haga bien. 
		do {
			System.out.println("Escribe un numero entre 1 y 29: ");
			num=entrada.nextInt;
	}while (num>0 && num<30);
	}
}
