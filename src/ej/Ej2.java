package ej;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fila = 5;
		int columna = 5;
		int[][] ARRAYBIDI = new int[fila][columna];

		// recorremos todo el array bidimensional
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				ARRAYBIDI[i][j] = i + j;
			}
		}

		System.out.println("Los valores de la tabla son:");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(ARRAYBIDI[i][j] + " ");
			}
		}

	}

}