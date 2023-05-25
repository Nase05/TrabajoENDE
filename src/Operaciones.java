
public class Operaciones {

	/**
	 * @author Nerea
	 * Método que nos calcule el factorial de un número, le pasamos el número
	 * como parámetro. Para calcular el factorial, se multiplica los números anteriores
	 * hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta operación
	 * 5*4*3*2*1=120.
	 */
	
	public int factorial(int numero) {
	/** @param i es el que usare para iterar
	 * @param producto es donde almaceno la solución
	 */
	 int i, producto = 1;
	 
	 /**
	  * Calcula el producto n*(n-1)*(n-2)*...*2*1
	  */
	 for (i = numero; i > 1; --i) { 
		 producto *= i;
	 }
	 /** @return Devuelve el resultado de la funcion*/
	 return producto;
	 
	}

	/** 	 	
	 * @author Nerea
	 * Método que reciba un número y devuelva si es primo o
	 * no. Un número primo es aquel solo puede dividirse entre 1 y si mismo
	 */
	public static boolean esPrimo(int numero) {
		  /**El 0, 1 y 4 no son primos*/
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int x = 2; x < numero / 2; x++) {
		   /** Si es divisible por cualquiera de estos números, no es primo*/
		    if (numero % x == 0)
		      return false;
		  }
		  /** @return Si no se pudo dividir por ninguno de los de arriba, sí es primo*/
		  return true;
		}
} 