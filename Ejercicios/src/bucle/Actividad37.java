package bucle;
 
public class Actividad37 {
	public static void main(String [] args) {
		int suma=0;
		for (int num=1;num>=1 && num<=50; num=num+1) {
			if (num%2==0) {
				System.out.println("es par: "+num);
			} else
			{
				System.out.println("es impar: "+num);
				suma=suma+num;
				System.out.println("la suma de los impares es: " +suma);
			
			}
		}
	}
}
 