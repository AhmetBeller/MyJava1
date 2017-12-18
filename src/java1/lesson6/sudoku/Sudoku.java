package java1.lesson6.sudoku;

public class Sudoku {
	// Überprüfen ob alle Zahlen im sudokuBoard zwischen 1 und 9 liegen:
	public static boolean checkNumberRange(int[][] sudokuBoard) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudokuBoard[i][j] < 1 || sudokuBoard[i][j] > 9) {
					return false;
				}
			}
		}
		return true;
	}

	// Überprüfen der 9 Zeilen (Horizontal) ob in allen die Werte zwischen 1 und 9 vorhanden sind:
	public static boolean checkRow(int[][] sukoBoard) {
		for (int row = 0; row < 9; row++) {
			int[] counter = new int[9];
			for (int element = 0; element < 9; element++) {
				counter[sukoBoard[row][element] - 1] = 1;
			}
			for (int i = 0; i < 9; i++) {
				if (counter[i] != 1) {
					System.out.println("Fehler in Reihe: " + row + "Spalte; " + i);
					return false;
				}
			}
		}
		return true;
	}

	// Überprüfen der 9 Spalten (Wertikal) ob in allen die Werte zwischen 1 und 9 vorhanden sind:
	public static boolean checkColumn(int[][] sukoBoard) {
		for (int column = 0; column < 9; column++) {
			int[] counter = new int[9];
			for (int element = 0; element < 9; element++) {
				counter[sukoBoard[element][column] - 1] = 1;
			}
			for (int i = 0; i < 9; i++) {
				if (counter[i] != 1) {
					System.out.println("Fehler in Reihe: " + i + "Spalte; " + column);
					return false;
				}
			}
		}
		return true;
	}

	// Überprüfen der Boxinhalte ob allen die Werte zwischen 1 und 9 vorhanden sind:
	public static boolean checkBox(int[][] sudokuBoard) {
		for (int xBox = 0; xBox < 3; xBox++) {
			for (int yBox = 0; yBox < 3; yBox++) {
				int xBoxStart = (xBox % 3) * 3;
				int yBoxStart = (yBox % 3) * 3;

				int[] counter = new int[9];
				for (int xElement = xBoxStart; xElement < xBoxStart + 3; xElement++) {
					for (int yElement = yBoxStart; yElement < yBoxStart + 3; yElement++) {
						counter[sudokuBoard[xElement][yElement] - 1] = 1;
					}
				}
				for (int i = 0; i < 9; i++) {
					if (counter[i] != 1) {
						System.out.println("Mistake in box x: " + xBox + " y: " + yBox);
						return false;
					}
				}
			}
		}
		return true;
	}

	// Methode um Sudoku auszugeben.
	public static void writeMatrix(int[][] sudokuBoard) {
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println(" -----------------------");
			}
			for (int j = 0; j < 9; ++j) {
				if (j % 3 == 0) {
					System.out.print("| ");
				}
	//			System.out.print(sudokuBoard[i][j] == 0 ? " " : "" + sudokuBoard[i][j]); // Für was diesen Bedingungsoperator ?
				System.out.print(sudokuBoard[i][j]);
				System.out.print(' ');
			}
			System.out.println("|");
		}
		System.out.println(" -----------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sudokuBoard = { { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 }, { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 } };

		Sudoku.writeMatrix(sudokuBoard);

		if (Sudoku.checkNumberRange(sudokuBoard)) {

			if (Sudoku.checkRow(sudokuBoard) && Sudoku.checkColumn(sudokuBoard) && Sudoku.checkBox(sudokuBoard)) {
				System.out.println("Sudoku Board is valid");
			} else {
				System.out.println("Sudoku Board is invalid");
			}
		} else {
			// some of the numbers on the Sudoku board are not between 1 and 9
			System.out.println("Sudoku Board is invalid");
		}

	}

}
