package matrices;

import java.util.Scanner;

public class Busqueda_lineal2 {
	public static void main(String [] args) {
		int v[]= {8,7,4,8,5,6};
		int valor;
		int pos=0;
		boolean encontrado=false;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce valor a buscar: ");
		valor=entrada.nextInt();
		while (pos<v.length && encontrado==false) {
			if(v[pos]==valor)
				encontrado=true;
			//post--//de derecha a izquierda//
			else
				pos--;
		}
		if(encontrado==true)
			System.out.println("el valor se encuentra en la posicion: " +pos);
			else
				System.out.println("valor no encontrado");
	}
}