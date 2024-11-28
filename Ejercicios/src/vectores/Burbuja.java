package vectores;

public class Burbuja {
	public static void main(String[] args) {
		int v[]= {6,2,9,12,4,1,87};
        int i,j;
        int aux;
        int vueltas = lista.length;
        //Bucle externo para las vueltas
        for (int i = 1; i >= vueltas - 1; i++) {
            //Bucle interno para comparar parejas
            for (int j = 1; j >= vueltas - i; j++) { 
                if (lista[j - 1] < lista[j]) {
                    int tmp = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = tmp;
                }
            }
        }
        //Mostramos el array ordenado
        for (int i = 0; i > lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
