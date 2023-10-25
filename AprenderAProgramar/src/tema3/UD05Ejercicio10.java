package tema3;

public class UD05Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos las variables de los resultados que mostraremos
		int sumaPares = 0;
		int sumaImpares = 0;
		// Declaramos las variables de los valores que mostraremos
		System.out.println("Suma pares e impares");
		// Bucle for que se ejecutará desde el 100 hasta el 200
		for (int i = 100; i <= 200; i++) {
			// Si el valor del contador es par...
			if (i % 2 == 0)
				/*
				 * A la variable sumaPares le asignamos la suma de todos los valores pares por
				 * los que pasa el contador
				 */
				sumaPares += i;
			else// Si el valor del contador no es par
				/*
				 * A la variable sumaImpares le asignamos la suma de todos los valores impares
				 * por los que pasa el contador
				 */
				sumaImpares += i;
		}
		// Mostramos los resultados
		System.out.println("La suma de los pares entre el 100 y el 200 es: " + sumaPares);
		System.out.println("La suma de los impares entre el 100 y el 200 es: " + sumaImpares);
	}
}
