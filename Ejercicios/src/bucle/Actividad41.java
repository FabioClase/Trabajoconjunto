package bucle;
	import java.util.Scanner;
public class Actividad41 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int lim;
		int num;
		int contador=0;
		int max=0;
		System.out.println("escribe el numero de sueldos que vas a introducir: ");
		lim=entrada.nextInt();
		do {
		System.out.println("escrbe un numero: ");
		num=entrada.nextInt();
		
		if(num>max) {
				max=num;
			}	
		contador=contador+1;	
		}while (contador!=lim);
		System.out.println("el salario maximo es: "+max);
		}
	}
