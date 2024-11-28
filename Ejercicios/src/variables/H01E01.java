package variables;

public class H01E01 {
	public static void main(String[] args) {
		//variablex para numeros decimales
		double x;
		//variable i entra y asignacion de valor 19
		int i=19;
		//variable c de caracter
		char c='D';
		//operacion
		x=c/i;
		System.out.println("letra en C:"+x);
		int valorLetra=c;
		System.out.println("Resultado: "+valorLetra);
		//opercacion
		x=c/i;
		System.out.println("Resultado: "+x);
		x=(double)c/i;
		System.out.println("Resultado: "+x);
	}
}
