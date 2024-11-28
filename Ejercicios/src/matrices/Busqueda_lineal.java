package matrices;

import java.util.Scanner;

public class Busqueda_lineal {
	public static void main(String [] args) {
		int v[]= {3,8,7,8,6,9};
		int valor;
		int pos=0;
		boolean encontrado=false;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce valor a buscar: ");
		valor=entrada.nextInt();
		while (pos<v.length && encontrado==false) {
			if(v[pos]==valor)
				encontrado=true;
			//post++//de izquierda a derecha//
			else
				pos++;
		}
		if(encontrado==true)
			System.out.println("el valor se encuentra en la posicion: " +pos);
			else
				System.out.println("valor no encontrado");
	}
}
