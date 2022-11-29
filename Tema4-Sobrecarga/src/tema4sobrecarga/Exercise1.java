package tema4sobrecarga;

import java.util.Scanner;

public class Exercise1 {

	static int suma(int num1, int num2) {
		
		int suma;
		
		suma = num1 + num2;
		
		return suma;
		
	}
	
	static double suma(double num3, double num4) {
		
		double suma;
		
		suma = num3 + num4;
		
		return suma;
		
	}
	
	public static void main(String[] args) {

		int num1, num2;
		double num3, num4;
		int suma1;
		double suma2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca otro número entero: ");
		num2 = sc.nextInt();
		System.out.println();
		
		suma1 = suma(num1, num2);
		
		System.out.println("La suma de ambos números enteros es: " + suma1);
		System.out.println();
		
		System.out.print("Introduzca un número con decimales: ");
		num3 = sc.nextDouble();
		System.out.print("Introduzca otro número con decimales: ");
		num4 = sc.nextDouble();
		System.out.println();
		
		suma2 = suma(num3, num4);
		
		System.out.println("La suma de ambos números con decimales es: " + suma2);
		
		sc.close();
		
	}

}
