package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	public static final String NÚMERO_DE_DIVISORES = "Número de divisores: ";
	private static Scanner lectura;

	public static void main(String[] args) {
		int numeroUsuario;
		long numDivisores;
		lectura = new Scanner(System.in);
		
		numeroUsuario = lectura.nextInt();
		numDivisores = primeDivisors(numeroUsuario);
		
		System.out.println(NÚMERO_DE_DIVISORES + numDivisores);
		lectura.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			if(number%i==0 && isPrime(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean isPrime(long number) {
		boolean esPrimo = true;
		for(int i=2; i<number; i++) {
			int modulo = number%i;
			if(modulo == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
