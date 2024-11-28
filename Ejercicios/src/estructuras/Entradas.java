package estructuras;

import java.util.Scanner;

public class Entradas {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		float numDecimal;
		double numDec2;
		char letra;
		String cadena;
		
		//Lectura de distintos tipos de datos
		//Entero
		System.out.println("Entero: ");
		num=entrada.nextInt();
		
		//Reales
		System.out.println("Número decimal (usar , para los decimales: ");
		numDecimal=entrada.nextFloat();
		
		System.out.println("Número decimal (usar , para los decimales: ");
		numDec2=entrada.nextDouble();
		
		System.out.println("Letra: ");
		letra=entrada.next().charAt(0);
		
		entrada.nextLine();
		System.out.println("Cadena: ");
		cadena=entrada.nextLine();
		
		//Salida
		System.out.println("Datos leídos: ");
		System.out.println(num+" - "+numDecimal+" - "+numDec2+" - "+letra+" - "+cadena);
		
		entrada.close();		
	}
}
