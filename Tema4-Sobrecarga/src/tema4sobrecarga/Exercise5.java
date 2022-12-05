package tema4sobrecarga;

import java.util.Scanner;

public class Exercise5 {

	static void numerosAleatorios (int cuant1) {
		
		for(int i = 1 ; i <= cuant1 ; i++) {

			System.out.println(Math.random());
			
		}
		
	}
	
	static void numerosAleatorios (int cuant1, int maxNum) {
	
		for (int i = 1 ; i <= cuant1 ; i++) {
			
			System.out.println((int) (Math.random()*(maxNum+1)));
			
		}
		
	}
	
	static void numerosAleatorios (int cuant1, int minNum, int maxNum) {
		
		for (int i = 1 ; i <= cuant1 ; i++) {
		
			System.out.println((int) (Math.random()*(maxNum+1-minNum))+minNum);
		
		}
		
	}
	
	public static void main(String[] args) {

		int cuant1;
		int maxNum;
		int minNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.println();
		numerosAleatorios(cuant1);
		
		System.out.println();
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.print("Introduzca el máximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		numerosAleatorios(cuant1, maxNum);
		
		System.out.println();
		System.out.print("Introduzca una cantidad de números aleatorios a generar: ");
		cuant1 = sc.nextInt();
		System.out.print("Introduzca el mínimo: ");
		minNum = sc.nextInt();
		System.out.print("Introduzca el máximo: ");
		maxNum = sc.nextInt();
		System.out.println();
		numerosAleatorios(cuant1, minNum, maxNum);
		
		sc.close();
		
	}

}
