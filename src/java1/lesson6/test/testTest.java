package java1.lesson6.test;

import java.util.Scanner;

public class testTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int punkte = scanner.nextInt();

		test max = new test();
		test.berechneNote(punkte);
		scanner.close();
	}

}
