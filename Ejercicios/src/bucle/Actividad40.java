package bucle;
import java.util.Scanner;
public class Actividad40 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int cont=0;
		String alumno;
		int edad;
		double altura; //la edad se escribe con ","
		double mediaedad=0;
		double medialtura=0;
		int contedad=0;
		int contaltura=0;
		double contmediaedad=0;
		double contmedialtura=0;
		do {
			System.out.println("escribe un alumno:");
			alumno=entrada.nextLine();
			System.out.println("escribe la edad de " +alumno+ ":");
			edad=entrada.nextInt();
			entrada.nextLine();
			System.out.println("la edad de " +alumno+ "es; " +edad);
			if (edad>18) {
			contedad=contedad+1;
			//System.out.println("tiene mas de 18");
			}
			contmediaedad=contmediaedad+edad;
			System.out.println("la altura de " +alumno+ ":");
			altura=entrada.nextDouble();
			entrada.nextLine();
			System.out.println("escribe la edad de " +alumno+ "es; " +altura);
			
			if (altura>1.75){
			contaltura=contaltura+1;
			//System.out.println("mide mas de 1.75");
			}
			contmedialtura=contmedialtura+altura;
			System.out.println(+contedad+ "personas tienes mas de 18 años");
			System.out.println(+contaltura+ "personas miden las de 1.75");
			cont=cont+1;
		}while (cont<5);
		mediaedad=contmediaedad/5;
		System.out.println("la media de todas las edades es: " +mediaedad);
		medialtura=contmedialtura/5;
		System.out.println("la media de todas las alturas es: " +medialtura);
	}
}