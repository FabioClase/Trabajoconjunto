package bucle;
	import java.util.Scanner;
public class Actividad31 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
	
		int veces;
		int num;
		int suma=0;
		float media;
		
		System.out.println("escribe cuantos numeros quieres meter:");
		veces=entrada.nextInt();
		for (int cont=1 ; cont <= veces; cont=cont+1) {
			System.out.println("escribe un numero:");
			num=entrada.nextInt();
			suma=num+suma;
			if (num%2==0)
			{
				System.out.println(+num+ " es par");
			}
		}
		media=suma/veces;
		System.out.println("la media es" +media);
	}
}
