package KatasBajos;

import java.util.Arrays;

public class kata3v1 {

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

	
	//LO FACIL
	  public static double findUniq(double arr[]) {
	      // Do the magic
	      Arrays.sort(arr);
	      if (arr[0] == arr[1]) {
	        return arr[arr.length-1];
	      }
	      return arr[0];
	    }
	}