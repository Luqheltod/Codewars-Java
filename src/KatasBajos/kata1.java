package KatasBajos;

public class kata1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Dado un array de numeros, devuelve la suma de todos los numeros positivos. 
		 * 
		 * Ejemplo [1,-4,7,12] => 1 + 7 + 12 = 20
		 * 
		 * Si no hay nada que sumar, la suma dará 0 
		 */

		
		int [] arrayNumeros= {22,-4,7,8,-1};
		
		int [] arrayVacio = {};
			
	System.out.println(sumaArray(arrayVacio));	
		
	System.out.println(sumaArray(arrayNumeros));	
		
	}

	public static int sumaArray(int [] array) {
		
		//primero comprobamos que el array contenga algo y que contenga algun positivo
		if(array.length==0) { 
			return 0;
		} else if (compruebaNegativos(array) ) {
			
			return 0;
		}
		//luego sumamos los positivoas y devolvemos la suma 
		
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] >0) {
				suma+=array[i];
			}
		}
		
		return suma;
	}
	
	
	public static boolean compruebaNegativos(int [] array) {
		
		boolean comprobacion = true;
		
		for (int i = 0; i < array.length; i++) {
			
			if( array[i] >0) {
				
				comprobacion = false;
			}
			
		}
		
		return comprobacion;
	}
}
