package tema2;

public class UD04Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos la variable lado y le asignamos 5
		int lado = 5;
		// Declaramos la variable area y le asignamos lado al cuadrado
		int area = (int) Math.pow(lado, 2);
		// Mostramos el área del cuadrado
		System.out.println("Un cuadrado con " + lado + " en cada lado, tiene de área " + area);
	}
}
