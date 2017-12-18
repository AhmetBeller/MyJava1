package java1.lesson8.vererbung;


public class GestaenkeShop {

	public static void main(String[] args) {
		
		Getraenke rivella = new SuessGetraenk(1.25, 150, 120);
		Getraenke cola = new SuessGetraenk(0.65, 50, 300);
		Getraenke ittinger = new AlkoholGetraenk(1.80, 33.3, 4.8);
		Getraenke chianti = new AlkoholGetraenk(12.60, 75, 11.9);
		
		Getraenke[] getraenkeListe = new Getraenke[4];
		
		getraenkeListe[0] = rivella;
		getraenkeListe[1] = cola;
		getraenkeListe[2] = ittinger;
		getraenkeListe[3] = chianti;
		
		double gesamtPreis = 0;
		double gesamtInhalt = 0;
		
		for(int i = 0; i < getraenkeListe.length; i++){
			Getraenke zwischenSpeicher = getraenkeListe[i];
			gesamtInhalt += zwischenSpeicher.getInhalt();
			gesamtPreis += zwischenSpeicher.getPreis();
			
			System.out.println(zwischenSpeicher.getText());
		}
		System.out.println("Gesamtpreis: " + gesamtPreis + " Fr.");
		System.out.println("Gesamtinhalt: " + gesamtInhalt + " cl");
	}
}

