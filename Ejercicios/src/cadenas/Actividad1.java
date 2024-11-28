package cadenas;
 
public class Actividad1 {
 
	public static void main(String[] args) {
		String texto = "Hola Mundo";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            System.out.println("Carácter en la posición " + i + ": " + caracter);
        }
 
	}
 
}