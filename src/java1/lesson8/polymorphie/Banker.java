package java1.lesson8.polymorphie;

public class Banker extends Person {

	public Banker(int einkommen) {
		super(einkommen);
	}

	public int steuer() {
		int steuer = 0;
		steuer = steuerbahresEinkommen / 4;
		steuer = steuer + 1000;
		return steuer;
	}

}
