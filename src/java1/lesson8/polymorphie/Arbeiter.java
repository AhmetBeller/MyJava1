package java1.lesson8.polymorphie;

public class Arbeiter extends Person {

	public Arbeiter(int einkommen) {
		super(einkommen);
	}

	public int zuVersteuerndesEinkommen() {
		steuerbahresEinkommen = einkommen - 2400;
		return steuerbahresEinkommen;
	}

}
