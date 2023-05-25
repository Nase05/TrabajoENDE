
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
	
} 