package ejemplos;

public class T3 {

	public static void main(String[] args) {

    final int NUM_LANZAMIENTOS = 10000;
    final int CARAS_DADO = 6;
      int[] contador = new int[CARAS_DADO];
		 
			       
     for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
		   int resultado = (int) (CARAS_DADO * Math.random()) + 1;
		   contador[resultado - 1]++;
			        }
		 
			
	for (int i = 0; i < CARAS_DADO; i++) {
		int ocurrencias = contador[i];
		int asteriscos = ocurrencias / 100;
		 System.out.print("El número " + (i + 1) + " ha salido " + ocurrencias + " veces: ");
		 for (int j = 0; j < asteriscos; j++) {
			 System.out.print("*");
			            }
	System.out.println();
			        }
			    
			

	
	}
}


import java.util.Random; 
public class SimuladorDado {     
	public static void main(String[] args) {         
		int[] resultados = new int[6]; 
		// Array para contar las veces que sale cada númeroRandom random = new Random();
		// Lanzar el dado 10,000 vecesfor (
		int i = 0; i < 10000; i++) {             
			int resultado = random.nextInt(6) + 1; 
			// Generar un número aleatorio entre 1 y 6            
			resultados[resultado - 1]++; 
			// Incrementar el contador correspondiente        
			}         
		// Mostrar los resultadosfor (int i = 0; i < 6; i++)
		{             int cantidad = resultados[i];             
		StringBuilder asteriscos = new StringBuilder(); 
		// Usar StringBuilder para construir la cadena de asteriscosfor (
		int j = 0; j < cantidad / 100; j++) 
{                 asteriscos.append("*"); 
// Agregar un asterisco por cada 100 } 
System.out.println("El número " + (i + 1) + " ha salido " + cantidad + " veces: " + asteriscos); 
} 
} 
}
		}

