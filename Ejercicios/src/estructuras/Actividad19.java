package estructuras;
import java.util.Scanner;

public class Actividad19 {
		public static void main(String [] args) {
				Scanner entrada=new Scanner(System.in);
				int numero;

				System.out.println("Introduce un numero del 1 al 7:");
				numero=entrada.nextInt();
				
				switch (numero) {
					case 1:
						System.out.println("Has seleccionado el dia Lunes");
						break;
					case 2:
						System.out.println("Has seleccionado el dia Martes");
						break;
					case 3:
						System.out.println("Has seleccionado el dia Miercoles");
						break;
					case 4:
						System.out.println("Has seleccionado el dia Jueves");
						break;
					case 5:
						System.out.println("Has seleccionado el dia Viernes");
						break;
					case 6:
						System.out.println("Has seleccionado el dia Sabado");
						break;
					case 7:
						System.out.println("Has seleccionado el dia Domingo");
						break;
					default:
						System.out.println("El valor introducido no es el correcto, introduce un valor del 1 al 7:");
						break;
					}	
			}
}