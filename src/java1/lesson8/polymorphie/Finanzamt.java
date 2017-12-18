package java1.lesson8.polymorphie;

public class Finanzamt {
	
	static int berechneSteuer(Person[] einwohner){		// Public oder Static?
		int tax = 0;
		for (int i = 0; i < einwohner.length; i++ ){
			tax = tax + einwohner[i].steuer();
		}
		return tax;
	}

	public static void main(String[] args) {
		Person[] personen = { new Person(6400), new Arbeiter(36000), new Banker(4000000), new Koenig(1000000) };

		for (int i = 0; i < personen.length; i++) {
			System.out.println("Person[" + i + "]: " + "zu verst. Einkommen = "
					+ personen[i].zuVersteuerndesEinkommen() + ", Steuer = " + personen[i].steuer());
		}
		
		int steuerGesamt = Finanzamt.berechneSteuer(personen);		// gross oder kleingeschrieben?
		System.out.println("Gesamte Steuern = " + steuerGesamt);
		
	}
}
