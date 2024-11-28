package bucle;
	import java.util.Scanner;
public class Actividad32 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
	String alumno;
	int nota;
	
		for (int cont=0; cont<10; cont=cont+1 ) {
			System.out.println("introduce un alumno: " );
			alumno = entrada.nextLine();
			System.out.println("el alumno es: " +alumno);
			do {
				System.out.println("introduce la nota de " +alumno);
				nota=entrada.nextInt();
			}while (nota<=0&&nota>=10);
			if (nota<5) {
				System.out.println(alumno+"está suspenso");
				}else {
				System.out.println(alumno+"está aprobado");
			}
		}
	}
}
