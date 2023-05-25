
public class Main {
	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();
		//Método de factorial
		System.out.println(operaciones.factorial(5));
		
		//Método de esPrimo
		if (Operaciones.esPrimo(2)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
	}
}
