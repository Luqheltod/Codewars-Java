package KatasBajos;

public class kata2 {

	public static void main(String[] args) {
		/*Crea una funcion que reciba 3 parametros - > operacion(string/char), valor1(int) valor2(int) 
		 * 
		 *y devuelva la operacion del primer atributo entre los 2 numeros. 
		 * 
		 * 
		 */

		
		
		
		
		System.out.println(Operacion("-",4,6));
	
	}

	public static int Operacion(String operador, int valor1, int valor2) {
		
		int suma = (int)'+';
		int resta = (int)'-';
		int multiplica = (int)'*';
		int divide = (int)'/';
		int operadorChar =(int) operador.charAt(0);
		
		
		if(operadorChar == suma) {
			return (valor1+valor2);
		} 
		
		if (operadorChar == resta) {
			return (valor1-valor2);
		}
		
		if (operadorChar == multiplica) {
			return (valor1*valor2); 
		}
		if (operadorChar == divide) {
			
			if(valor2== 0) {
				return 0;
			} else {
				return (valor1/valor2);
			}
		}
		
		return 0;
	
	}
	
}
