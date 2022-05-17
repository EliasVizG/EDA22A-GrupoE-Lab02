//Lista

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {
		List<String> citricos = new ArrayList<>();
		citricos.add("naranja");
		citricos.add(0, "mandarina");
		citricos.add("limon");
		citricos.add("lima");
		citricos.add("toronja");
		System.out.println(citricos);

		List<String> frutas = new ArrayList<>(); // no necesitamos especificar que el arraylist sera de Strings porque
													// java lo infiere
		frutas.add("banana");
		frutas.add("manzana");
		frutas.addAll(citricos);
		System.out.println(frutas);

		citricos.clear();
		System.out.println(citricos);
		System.out.println(frutas.get(4));

	}
}