package bucle;
	import java.util.Scanner;
public class Actividad45 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		int aprobados=0;
		int cuatros=0;
		int suspensos=0;
		
		for (int cont=0; cont!=6; cont=cont+1) {
			System.out.println("escribe la nota de 0 a 10:");
			nota=entrada.nextInt();
			if (nota>=5) {
				System.out.println("es aprobado:");
				aprobados=aprobados+1;
			}else {
			if (nota==4) {
				System.out.println("es condicionado:");
				cuatros=cuatros+1;
			} else {
				System.out.println("es suspenso:");
				suspensos=suspensos+1;
			}
			}	
		}
		System.out.println("hay " +aprobados+ " aprobados");
		System.out.println("hay " +cuatros+ " condicionados");
		System.out.println("hay " +suspensos+ " suspensos");
	}
}
