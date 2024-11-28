package cadenas;
 
public class Actividad2 {
 
	public static void main(String[] args) {
		String texto = "Hola Mundo";
		String vocales="aeiou";
        int cont=0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (vocales.indexOf(caracter)!=-1) {
            	cont=cont+1;
            }
            
        }
        System.out.println("hay "+cont+ " vocales");
	}
 
}