package java1.lesson5.klassen;

public class TennisSpieler { // Pro File darf es nur eine "public class" geben // Weitere classen nur "class" und "Name" angeben
	public String name; // Instanz oder Objektvariable
	public int alter; // Instanz oder Objektvariable
	private int startNummer = 0;
	private static int folgeNummer = 1; // static = Klassenvariable
	public boolean istLetzter;

	public TennisSpieler verfolger; // Objekt Typ TennisSpieler verfolger decklariert

	public TennisSpieler(String name, int alter, TennisSpieler verfolger) { // Kostrucktor um Pparameter zuzuweisen
		this.name = name;
		this.alter = alter;
		startNummer = folgeNummer++;
		this.verfolger = verfolger;

		System.out.println(name + " Alter: " + alter + " StartNr.: " + startNummer + " VolgeNr.: " + folgeNummer);
	}

	public TennisSpieler(String name, int alter) { // Konstrukter für erster Spieler
		this(name, alter, null);
		istLetzter = true;
	}

	public int getStartNummer() {
		return startNummer;
	}

	public int altersDifferenz(int alter) {
		return Math.abs(alter - this.alter);
	}

}
