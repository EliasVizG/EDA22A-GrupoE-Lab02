//Triángulo recursivo

public class Ejercicio3 {
	public static void main(String[] args) {

		int base = 6;
		trianguloRecursivo(base);

	}

	public static void trianguloRecursivo(int base) {
		for (int i = 0; i < base; i++) {
			for (int j = 0; j <= i; j++) {// <= para que al inicio se imprima * al menos 1 ves en lugar de 0
				System.out.print("*");
			}
			System.out.println(); // salto de linea al final de cada for anidado
		}
	}
}
