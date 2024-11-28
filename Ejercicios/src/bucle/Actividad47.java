package bucle;
	import java.util.Scanner;
public class Actividad47 {
 
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int edad;
		int suma=0;
		int cont=0;
		int media=0;
		int contcinq=0;
		double porcentaje=0;
		do {
			System.out.println("introduce una edad:");
			edad=entrada.nextInt();
			if (edad>50) {
				contcinq=contcinq+1;
			}
			suma=suma+edad;
			cont=cont+1;
			
		}while (edad!=0);
		media=suma%cont;
		porcentaje=((double)cont/contcinq)*100;
		System.out.println(+suma);
		System.out.println(+cont);
		System.out.println(+porcentaje+ "%");
	}
 
}