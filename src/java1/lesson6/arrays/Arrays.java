package java1.lesson6.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aufgabe 1.");

		double[] array1 = { 1.9, 2.8, 3.7, 4.6 };

		System.out.println("Array 1.:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		double[] array2 = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };

		System.out.println("\nArray 2.:");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		double[] array3 = new double[array1.length + array2.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);

		System.out.println("\n\nArray 3. aus Array 1. und Array 2. mit System.arraycopy:");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}

		double[] array4 = new double[array1.length + array2.length];

		System.out.println("\n\nArray 4. aus Array 1. und Array 2. mit Kopierschlaufe:");
		for (int i = 0; i < array4.length; i++) {
			if (i < array1.length) {
				array4[i] = array1[i];
			} else {
				array4[i] = array2[i - array1.length];
			}
			System.out.print(array3[i] + " ");
		}

	}

}
