package tema3;

public class UD05Ejercicio02 {

	public static void main(String[] args) {
		// Presentamos el programa
		System.out.println("Números pares desde el 1 hasta el 200");
		// Bucle for que se ejecutará desde el 1 hasta el 200
		for (int i = 1; i <= 200; i++)
			// Sólo si se cumple la condición, mostramos este resultado (el valor del contador)
			if (i % 2 == 0)
				System.out.println(i);

	}

}
