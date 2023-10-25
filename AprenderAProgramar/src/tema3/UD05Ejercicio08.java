package tema3;

public class UD05Ejercicio08 {

	public static void main(String[] args) {
		// Declaramos las variables de los resultados que mostraremos
		int suma = 0;
		int producto = 1;
		// Presentamos el programa
		System.out.println("Suma y producto 10 primeros números");
		// Bucle for que se ejecutará desde el 1 hasta el 10
		for (int i = 1; i <= 10; i++) {
			/*
			 * A la variable suma le asignamos la suma de todos los valores por los que pasa
			 * el contador
			 */
			suma += i;
			/*
			 * A la variable producto le asignamos el producto de todos los valores por los que pasa
			 * el contador
			 */
			producto *= i;
		}
		// Mostramos los resultados
		System.out.println("La suma de los 10 primeros números es: " + suma);
		System.out.println("El producto de los 10 primeros números es: " + producto);
	}

}
