package ej;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int tamaño = 0;
		

		System.out.println("Diga el tamaño");
		tamaño = s.nextInt();
	
		int[]numeros  = new int[tamaño];
		
		System.out.println("Escriba los números");
		for (int f = 0; f < tamaño; f++) {
			numeros[f] = s.nextInt();
		}
		
		System.out.println("La media de los números positivos es "+Positivos(numeros));
		System.out.println("La media de los números negativos es "+Negativos(numeros));
		System.out.println("El número de ceros que hay es "+cuentaceros(numeros));
	}

	public static int Positivos(int numeros[]) {
		int media = 0;
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				media += numeros[i];
				contador++;
			}
		}
		return media/ contador ;
	}

	public static int Negativos(int numeros[]) {
		int media = 0;
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				media += numeros[i];
				contador++;
			}
		}
		return media / contador;
	}

	public static int cuentaceros(int numeros[]) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 0) {
				contador++;
			}
		}
		return contador;
	}

}