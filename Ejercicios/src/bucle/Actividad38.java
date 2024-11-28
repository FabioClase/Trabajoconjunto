package bucle;
	import java.util.Scanner;
public class Actividad38 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		String valor;
		int horas;
		int salarioh=0;
		int extra=0;
		int salarionormal=0;
		int salarioextra=0;
		int salariototalextra=0;
		do {
			System.out.println("escribe tus horas trabajadas: ");
			horas=entrada.nextInt();
			if(horas<=35) {
				salarioh=15*horas;
			System.out.println("el salario por horas es: " +salarioh);
			}else
				extra=horas-35;
			System.out.println("extras son: "+extra);
			salarionormal=35*15;
			salarioextra=extra*22;
			System.out.println("el salario extra es: "+salarioextra);
			salariototalextra=salarionormal+salarioextra;
		}while (horas!=0);
		
	}
}
 