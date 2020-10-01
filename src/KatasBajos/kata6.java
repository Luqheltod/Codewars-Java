package KatasBajos;


import org.apache.commons.lang3.StringUtils;

public class kata6 {

	
	public static void main(String[] args) {
		
		//realiza un metodo que devuelva el numero de vocales de un string . 
		
		String prueba = "probandóaaa";
		
		System.out.println(getCount(prueba));
		
		
	}
	
	
	 public static int getCount(String str) {
		    int vowelsCount = 0;
		    
		   str = StringUtils.stripAccents(str) ;
		    
		    str = str.toLowerCase(); 
		    
		    for(int i=0;i < str.length();i++) {
		    	 if ( (str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u')){ 
		    	    vowelsCount++;
		    	  }
		    
		    
		   
		  }
		    return vowelsCount;
}
}