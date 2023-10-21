package tema2;

import java.util.Scanner;

public class UD04Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos las variables para el lado y el área del cuadrado
		int lado, area;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba el lado del cuadrado
		System.out.println("Introduzca el lado del cuadrado y mostraremos el área");
		// Leemos el número
		lado = sc.nextInt();
		// Establecemos la relación de las variables
		area = (int) Math.pow(lado, 2);
		// Mostramos el resultado
		System.out.println("Su área es de " + area);
		// Cerramos el Scanner
		sc.close();
	}
}
