package mio;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int existencias =3200, entregadas;
		
		while(existencias>=100) {
			System.out.println("Selecciona en nº de existencias a pedir");
			entregadas =sc.nextInt();
			existencias -= entregadas;
			System.out.println("Existencias actuales " + existencias);
		}
		System.out.println("No existen existencias disponibles");
		
	}

}
