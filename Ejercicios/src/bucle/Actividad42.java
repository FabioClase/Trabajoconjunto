package bucle;
 
import java.util.Scanner;
 
public class Actividad42 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        int cont = 0;
        int suma = 0;
 
        // Se pide el número de exámenes (en este caso, 5)
        do {    
            System.out.println("Escribe la nota (entre 0 y 10):");
            nota = entrada.nextInt();
 
            // Validar si la nota está en el rango permitido
            if (nota < 0 || nota > 10) {
                System.out.println("Número no válido, escribe otro: ");
                continue;  // Saltar al siguiente ciclo del bucle
            }
            // Contar cuántas notas son menores que 5 (suspensos)
            if (nota < 5) {
                suma++;
            }
 
            cont++;  // Incrementamos el contador de notas válidas
 
        } while (cont != 5);  // Continuamos hasta haber procesado 5 notas
 
        System.out.println("Hay " + suma + " exámenes suspensos.");
    }
}