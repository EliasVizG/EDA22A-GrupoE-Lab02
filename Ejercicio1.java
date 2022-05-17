//Invertir un matriz de enteros

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 12, 74, 123, 71, 95, 23, 121, 133, 56, 156 };
		printArr(arr);

		int[] arrIn = invertirArray(arr);
		printArr(arrIn);

	}

	public static int[] invertirArray(int[] A) {
		int[] Ain = new int[A.length];
		int invertedIndex = A.length - 1;

		for (int i : A) {
			Ain[invertedIndex] = i;
			invertedIndex--;
		}
		return Ain;
	}

	// Metodo de ayuda para mostrar arrays
	public static void printArr(int[] A) {

		for (int i : A) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

}
