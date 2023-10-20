package tema2;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num3 = sc.nextInt();
		if (num1 > 10 || num2 > 10 || num3 > 10)
			System.out.println("ALGUNO MAYOR QUE 10");
		else
			System.out.println("NINGUNO MAYOR QUE 10");
		sc.close();
	}
}
