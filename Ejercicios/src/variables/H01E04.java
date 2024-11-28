package variables;

public class H01E04 {
	public static void main(String[] args) {
		//variables
		int giros;
		giros=20000;
		//declaro una constante y asigno su valor
		final int VUELTA=360;
		int nvueltas=0;
		int grados=0;
		//operaciones
		nvueltas=giros/VUELTA;
		grados=giros%VUELTA;
		//salida de datos
		System.out.println("damos "+nvueltas+" vueltas completas");
		System.out.println("hemos dado "+grados+" grados en la ultima vuelta");
		
	}
}
