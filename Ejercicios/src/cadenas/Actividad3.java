package cadenas;
 
public class Actividad3 {
 
	public static void main(String[] args) {
		String texto = "Hola Mundo";
		System.out.println("frase : " +texto);
        
        for (int i = texto.length()-1; i >=0; i--) {
            char caracter = texto.charAt(i);
            System.out.print("frase invertida: "+caracter);
        }
    }
}

 