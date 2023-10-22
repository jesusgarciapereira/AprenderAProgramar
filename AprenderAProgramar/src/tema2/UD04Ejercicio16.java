package tema2;

import java.util.Locale;
import java.util.Scanner;

public class UD04Ejercicio16 {

	public static void main(String[] args) {
		// Declaramos la variable de la nota que le pediremos al usuario
		double nota;
		// Declaramos la variable de la calificación que vamos a mostrar
		String calificacion;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Calificaciones");
		// Le pedimos al usuario su nota
		System.out.println("Introduzca su nota");
		// Leemos el número
		nota = sc.nextDouble();
		// El valor que tomará la calificación, dependerá de los valores que pueda tener la nota
		if (nota >= 0 && nota < 3)
			calificacion = "Muy deficiente";
		else if (nota >= 3 && nota < 5)
			calificacion = "Insuficiente";
		else if (nota >= 5 && nota < 6)
			calificacion = "Bien";
		else if (nota >= 6 && nota < 9)
			calificacion = "Notable";
		else if (nota >= 9 && nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "NOTA INCORRECTA";
		// Mostramos el valor de la calificación
		System.out.println(calificacion);
		// Cerramos el Scanner
		sc.close();
	}
}
