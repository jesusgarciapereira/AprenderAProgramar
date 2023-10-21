package tema2;

import java.util.Scanner;

public class UD04Ejercicio04 {

	public static void main(String[] args) {
		// Declaramos las variables de los dos números que le pediremos al usuario
		int num1, num2;
		// Declaramos las variables de las operaciones que vamos a mostrar
		int suma, resta, producto, division;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Establecemos la relación entre estas variables
		suma = num1 + num2;
		// Mostramos la suma
		System.out.println(num1 + " + " + num2 + " = " + suma);
		// Establecemos la relación entre estas variables
		resta = num1 - num2;
		// Mostramos la resta
		System.out.println(num1 + " - " + num2 + " = " + resta);
		// Establecemos la relación entre estas variables
		producto = num1 * num2;
		// Mostramos el producto
		System.out.println(num1 + " * " + num2 + " = " + producto);
		// Si el segundo número es 0, mostraremos el siguiente mensaje
		if (num2 == 0)
			System.out.println("No se puede dividir entre 0");
		// Por el contrario, ejecutaremos las siguientes instrucciones
		else {
			// Establecemos la relación entre estas variables
			division = num1 / num2;
			// Mostramos la división
			System.out.println(num1 + " / " + num2 + " = " + division);
		}
		// Cerramos el Scanner
		sc.close();
	}
}
