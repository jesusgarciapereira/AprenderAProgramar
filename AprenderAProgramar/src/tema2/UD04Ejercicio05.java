package tema2;

import java.util.Locale;
import java.util.Scanner;

public class UD04Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos la constante del número pi
		final double PI = Math.PI;
		// Declaramos la variable del radio que pediremos al usuario
		double radio;
		// Declaramos las variables que mostraremos por la consola
		double circunferencia, area, volumen;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario que escriba el radio de la circunferencia
		System.out.println("Introduzca la longitud del radio de la circunferencia");
		System.out.println("(si tiene decimales, utilice el punto como en el ejemplo: 1.1)");
		// Leemos el número
		radio = sc.nextDouble();
		// Establecemos la relación entre las variables
		circunferencia = 2 * radio * PI;
		area = PI * Math.pow(radio, 2);
		/*
		 * Importante: Es necesatio aplicar una conversión de clases en uno de los
		 * números que se dividen para que conserven los decimales y el resultado sea
		 * mucho más preciso.
		 * volumen = (double) 4 / 3 * PI * Math.pow(radio, 3);
		 */
		// Aunque también sirve escribir primero la constante PI porque éste ya es un double
		volumen = PI * 4 / 3 * Math.pow(radio, 3);
		// Mostramos el resultado
		System.out.println("Longitud de la circunferencia, área del círculo y volumen de la esfera");
		// Para que sólo muestre dos decimales, optaré mejor por usar printf
		System.out.printf("%.2f %.2f %.2f", circunferencia, area, volumen);
		// Cerramos el Scanner
		sc.close();
	}
}
