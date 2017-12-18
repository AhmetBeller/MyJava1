package java1.lesson5.klassen;

public class TennisSpielerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisSpieler spieler1 = new TennisSpieler("Timon", 24); // Objekt TennisSpieler erzeugt und zugewiesen

		TennisSpieler spieler2 = new TennisSpieler("Max", 13, spieler1); // Objekt TennisSpieler erzeugt und zugewiesen

		TennisSpieler spieler3 = new TennisSpieler("Timon", 22, spieler2); // Objekt TennisSpieler erzeugt und
																			// zugewiesen

	}

}
