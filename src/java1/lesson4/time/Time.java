package java1.lesson4.time;

public class Time {

	private int totalSeconds;

	// Anzahl Sekunden während eines Tages
	private final static int SECONDS_A_DAY = 60 * 60 * 24;

	/**
	 * Erzeugt eine Zeit h:m:s
	 * 
	 * @param h
	 *            Stunden
	 * @param m
	 *            Minuten
	 * @param s
	 *            Sekunden
	 */
	public void setTime(int h, int m, int s) {
		// alles in Sekunden umrechnen
		int t = 60 * (60 * h + m) + s;

		t = t % SECONDS_A_DAY;

		if (t < 0) {
			t = t + SECONDS_A_DAY;
		}
		totalSeconds = t;

	}

	/**
	 * Liefert die Uhrzeit in Sekunden.
	 * 
	 * @return Sekunden seit Mitternacht
	 */
	public int totalSeconds() {
		return totalSeconds;
	}

	/**
	 * Liefert die Anzahl Sekunden (0-59).
	 * 
	 * @return Sekunden
	 */
	public int seconds() {
		return totalSeconds % 60;
	}

	/**
	 * Liefert die Anzahl Minuten (0-59).
	 * 
	 * @return Minuten
	 */
	public int minutes() {
		return totalSeconds / 60 % 60;
	}

	/**
	 * Liefert die Anzahl Stunden (0-23).
	 * 
	 * @return Stunden
	 */
	public int hours() {
		return totalSeconds / 60 / 60;
	}

	/**
	 * Addiere Anzahl Sekunden zur Zeit (auch negative Angaben möglich).
	 * 
	 * @param s
	 *            Sekunden
	 * @return neue Zeit
	 */
	public void add(int s) {
		int t = totalSeconds + s;

		t = t % SECONDS_A_DAY;

		if (t < 0) {
			t = t + SECONDS_A_DAY;
		}
		totalSeconds = t;
	}

	/**
	 * Gibt die Zeit in Form 00:00:00 aus
	 */
	public void printTime() {
		// komplizierte formatierung mit println => 00:00:00
		// System.out.println("\n"+(hours()>9?hours():"0"+hours())+":"+(minutes()>9?minutes():"0"+minutes())+":"+(seconds()>9?seconds():"0"+seconds()));
		// einfacher mit printf
		System.out.printf("\n%02d:%02d:%02d", hours(), minutes(), seconds());
	}

	public static void main(String[] args) {
		Time time = new Time();
		time.setTime(23, 59, 30);
		time.add(35);
		time.printTime();
		time.setTime(00, 01, 13);
		time.add(-120);
		time.printTime();
	}

}
