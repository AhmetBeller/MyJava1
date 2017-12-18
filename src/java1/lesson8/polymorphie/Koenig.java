package java1.lesson8.polymorphie;

public class Koenig extends Person {

	public Koenig(int einkommen) {
		super(einkommen);
	}

	public int zuVersteuerndesEinkommen() {
		return 0;
	}

}
