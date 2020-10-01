package KatasBajos;

public class kata5 {

	public static void main(String[] args) {
		/*
		 * Escribe una funcion que detecte los duplicados en los strings, los strings solo tendran letras y numeros.
		 * 
		 */

		
		String x = "abccb";
		
	
		System.out.println(duplicateCount(x));
	}
	
	public static int duplicateCount(String text) {
	   //lo convertimos todo a minusculas 
		 text = text.toLowerCase();
		
		StringBuilder duplicados = new StringBuilder();
		
		//comparamos cada caracter con todos los demas, si no es igual a ningun otro, lo eliminamos del string, si es 
		//igual a algun otro, lo añadimos a nuestra variable stringbuilder y eliminamos del texto todos los demas
		
			for (int i = 0; i < text.length()-1;) {
				
				boolean nomas = false;
				for (int j = 1; j < text.length();j++) {
					
					if(text.charAt(i) == text.charAt(j)) {
						
						duplicados.append(text.charAt(i));
						text=	text.replace(String.valueOf(text.charAt(i)),"");
						nomas = true;
						break;
				} 
					
					
			}
		if (!nomas) {
			text=	text.replace(String.valueOf(text.charAt(i)),"");
		}
				System.out.println(duplicados);
				System.out.println(text);
		}
			
			

		return duplicados.length();
	  }
	

}