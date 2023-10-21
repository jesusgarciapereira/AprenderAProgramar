package tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos las variables del sueldo y de los años de antigüedad que pediremos
		int sueldo, antiguedad;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Aumento de sueldo");
		// Le pedimos al usuario que introduzca el sueldo
		System.out.println("Introduzca el sueldo del operario (sin decimales)");
		// Leemos el número
		sueldo = sc.nextInt();
		// Le pedimos al usuario que introduzca los los años de antigüedad
		System.out.println("Introduzca los años de antigüedad del operario (en número)");
		// Leemos el número
		antiguedad = sc.nextInt();
		// Si el sueldo es inferior a 500...
		if (sueldo < 500)
			// ... y la antiguedad es igual o superior a 10
			if (antiguedad >= 10)
				sueldo *= 3; // El sueldo se multiplicará por 3
			// ... y la antiguedad es inferior a 10
			else
				sueldo *= 2;// El sueldo se multiplicará por 2
		// Si el sueldo es mayor o igual a 500, no aplicaremos ningún cambio al sueldo
		// Mostramos el resultado
		System.out.println(sueldo);
		// Cerramos el Scanner
		sc.close();
	}

}
