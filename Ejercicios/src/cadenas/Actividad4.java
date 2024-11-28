package cadenas;
import java.util.Scanner;
public class Actividad4 {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		String texto;
		String busqueda;
        int cont=0;
        System.out.println("escribe una frase: ");
        texto=entrada.nextLine();
        System.out.println("escribe el caracter que se buscara: ");
        busqueda=entrada.next();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (busqueda.indexOf(caracter)!=-1) {
            	cont=cont+1;
            }
            
        }
        System.out.println("el caracter está " +cont+ " veces"); 
	}
 
}
 