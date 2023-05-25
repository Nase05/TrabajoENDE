import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();
		Scanner teclado = new Scanner(System.in);
		
		//Método de factorial
		int numero;
		
		System.out.println("Escribe un número para saber su factorial");
		numero = Integer.parseInt(teclado.nextLine());
		System.out.println("El factorial de " + numero + " es: " + operaciones.factorial(numero));
		
		//Método de esPrimo
		System.out.println("Escribe un número para saber si es primo");
		numero = Integer.parseInt(teclado.nextLine());
		if (Operaciones.esPrimo(numero)) {
			System.out.println(numero + " es primo");
		} else {
			System.out.println(numero + " no es primo");
		}
		
	}
}
