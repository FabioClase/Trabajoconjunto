package bucle;

public class Aj3algoritmo2 {
	public static void main(String[] args) {
		//variables
		int num=253415;
		int cifra;
		//bucle
		while(num!=0) {
			cifra=num%10;
			num=num/10;
			System.out.print(cifra+" ");
		}
		System.out.println("\nFin");
	}
}
