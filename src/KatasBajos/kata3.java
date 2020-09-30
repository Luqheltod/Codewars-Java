package KatasBajos;

import java.util.Arrays;

public class kata3 {

	public static void main(String[] args) {
		/*
		 * Dado un array con todos los numeros iguales menos 1, encontrar cual es el
		 * distinto.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		double[] array = { 1, 1, 6, 1, 1 };

		System.out.println(findUniq(array));
	}

	
	//LO COMPLICADO
	public static double findUniq(double arr[]) {
		
		double [] mayoria = new double[arr.length];
		double [] minoria = new double[1];
		
		Arrays.sort(arr);
		
		//comparamos todos los numeros con los demas, si es igual al menos a otro, le metemos en un array y si no lo es lo metemos en el otro. 
		//despues mostramos el que tiene menos. 
		
	      do {
		for (int i = 0; i < arr.length ;i++) {
			
			int contador = 0;
			
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i] == arr[j] ) {
					
					contador++;
					
				} }
				if (contador > 1) {
					mayoria[i]=arr[i];
				} else {
					minoria[0]=arr[i];
					
				}
			}
			
		} 	while(minoria.length==0);
		
		return minoria[0];
	}
}
