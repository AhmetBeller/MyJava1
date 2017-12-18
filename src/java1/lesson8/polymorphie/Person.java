package java1.lesson8.polymorphie;

public class Person {
	public int einkommen;
	public int steuerbahresEinkommen = 0;

	Person(int einkommen) {
		this.einkommen = einkommen;
	}

	public int steuer() {
		return steuerbahresEinkommen / 4;
	}

	public int zuVersteuerndesEinkommen() {
		steuerbahresEinkommen = einkommen;
		return steuerbahresEinkommen;
	}

}
