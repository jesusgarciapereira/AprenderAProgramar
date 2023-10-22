package tema2;

import java.util.Locale;
import java.util.Scanner;

public class UD04Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables de las horas trabajadas y del precio por hora que le
		 * pediremos al usuario
		 */
		int horasTrabajadas;
		double precioPorHora;
		/*
		 * Declaramos las variables del salario neto que necesitamos calcular y el
		 * salario bruto que vamos a mostrar
		 */
		double salarioNeto, salarioBruto;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Salario y sus impuestos");
		// Le pedimos al usuario el número de horas trabajadas
		System.out.println("Introduzca el número de horas trabajadas");
		// Leemos el número
		horasTrabajadas = sc.nextInt();
		// Le pedimos al usuario el precio por hora
		System.out.println("Introduzca el precio por hora");
		// Leemos el número
		precioPorHora = sc.nextDouble();
		// El valor del salario neto dependera del valor de las horas trabajadas
		if (horasTrabajadas > 35)
			salarioNeto = precioPorHora * (35 + (horasTrabajadas - 35) * 1.5);
		else
			salarioNeto = horasTrabajadas * precioPorHora;
		// El valor del salario bruto dependera del valor del salario neto
		if (salarioNeto <= 500)
			salarioBruto = salarioNeto;
		else if (salarioNeto > 500 && salarioNeto <= 900)
			salarioBruto = 500 + (salarioNeto - 500) * (100 - 25) / 100;
		else
			salarioBruto = 500 + (salarioNeto - 500) * (100 - 25) / 100 + (salarioNeto - 900) * (100 - 45) / 100;
		// Mostramos el resultado pero con dos decimales, optaré mejor por usar printf
		System.out.printf("El salario bruto es de: %.2f", salarioBruto);
		// Cerramos el Scanner
		sc.close();
	}

}
