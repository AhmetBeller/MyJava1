package java1.lesson6.schleife;

public class Schleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 10) {		// While Schleife
			i++;
			if (i < 4) {
				System.out.println(i);
				continue;
			}
			System.out.println(i);
			i++;
		}

		for (int j = 2; j <= 10; j++) {		// For Schleife
			if (j <= 4 || j == 6 || j == 8 || j == 10) {
				System.out.println(j);
			}

		}

	}

}
