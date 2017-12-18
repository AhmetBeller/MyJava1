package java1.lesson6.test;

public class test {

	public static int berechneNote(int punkte) {
		int note = 0;
		if (punkte >= 0 && punkte <= 10) {
			note = 1;
		} else if (punkte >= 11 && punkte <= 18) {
			note = 2;
		} else if (punkte >= 19 && punkte <= 26) {
			note = 3;
		} else if (punkte >= 27 && punkte <= 34) {
			note = 4;
		} else if (punkte >= 35 && punkte <= 42) {
			note = 5;
		} else if (punkte >= 43 && punkte <= 50) {
			note = 6;
		} else {
			note = -1;
		}

		System.out.println(note);
		return note;
	}

}
