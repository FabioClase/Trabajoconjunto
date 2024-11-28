package estructuras;
import java.util.Scanner;

public class ejer19 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1;
		//entrada:leemos entero
		System.out.println("introduce un numero de 1 a 7");
		num1=entrada.nextInt();
		
		//proceso y salida
		if (num1==1)
			System.out.println("es lunes");
		else {
			if (num1==2)
				System.out.println ("es martes");
			else {
				if (num1==3)
					System.out.println ("es miercoles");
				else {
					if (num1==4)
						System.out.println ("es jueves");
					else {
						if (num1==5)
							System.out.println ("es viernes");
						else {
							if (num1==6)
								System.out.println ("es sabado");
							else {
								if (num1==7)
									System.out.println ("es domingo");
								else 
									System.out.println ("no es correcto el numero, introduce otro");
							}
						}
					}
				}
			}
		}
	}
}
