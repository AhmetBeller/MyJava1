package java1.lesson6.velo;

import java.util.Scanner;

public class TestVelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int schaltWert = scanner.nextInt();

		Velo sport1 = new Velo(25, 9);

		sport1.schaltung(schaltWert);

	}

}
