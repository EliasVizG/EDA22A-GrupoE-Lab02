//Rotación a la Izquierda
public class Ejercicio2 {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 12, 74, 123, 71, 95, 23, 121, 133, 56, 156 };
		printArr(arr);
		int d = 3; // factor de rotacion
		int[] arrIn = rotarIzquierdaArray(arr, d);
		printArr(arrIn);

	}

	public static int[] rotarIzquierdaArray(int[] A, int increase) {
		int[] Aiz = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			// Si el nuevo indice seria >= al largo del array, entonces rota y se coloca en
			// los primeros indices
			if (i + increase >= A.length)
				Aiz[i] = A[i + increase - A.length];
			// De otra manera, se rota normalmente los valores
			else
				Aiz[i] = A[i + increase];

		}
		return Aiz;
	}

	// Metodo de ayuda para mostrar arrays
	public static void printArr(int[] A) {

		for (int i : A) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
