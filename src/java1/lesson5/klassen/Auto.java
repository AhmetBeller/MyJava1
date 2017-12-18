package java1.lesson5.klassen;

public class Auto {
	private String farbe;		// Objekt Variablen
	private int preis;
	private short hubraum;
	private long serienNr = 100;
	
	private static int verkaufteAutos; // Classen Variablen
	private static long[] verwendeteSerienNr = new long[10];
	private static Auto[] alleAutos = new Auto[10];

	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	public short getHubraum() {
		return hubraum;
	}
	public void setHubraum(short hubraum) {
		this.hubraum = hubraum;
	}
	public long getSerienNr() {
		return serienNr;
	}

	public static int getVerkaufteAutos() {
		return verkaufteAutos;
	}	
	
	public static long[] getVerwendeteSerienNr() {
		return verwendeteSerienNr;
	}
	
	public void print(){	// Methode void gibt keinen Wert zurück!
		System.out.println("Farbe: " + farbe);
		System.out.println("Preis: " + preis);
		System.out.println("Hubraum: " + hubraum);
		System.out.println("SN: " + serienNr + "\n");
	}
	
	public Auto(){
		this.init();
	}
	
	private void init(){
		for( int i = 0; i < verwendeteSerienNr.length; i++ ){
			if (verwendeteSerienNr[i] == 0){ // freier Platz gefunden
				this.serienNr = 100 +i;
				this.verwendeteSerienNr[i] = 99 +i;
				this.verkaufteAutos++;
				
				this.alleAutos[i] = this; // Abfüllen Array alleAutos
				
				break;
			}
		}
	}
	
	public static int getGesUmsatz(){	// static, da keine Instanz am laufen
		int umsatz = 0;
		for( int i = 0; i < alleAutos.length; i++ ){
			umsatz = umsatz + alleAutos[i].preis;
		}
		return umsatz;
	}
	
	public static String getLieblingsFarbe(){
		String lieblingsFarbe = "";
		int weiss = 0;
		int blau = 0;
		int rot = 0;
		int gruen = 0;
		
		for( int i = 0; i < alleAutos.length; i++ ){
			switch(alleAutos[i].farbe){
				case "Weiss":{
					weiss++;
					break;
				}
				case "Blau":{
					blau++;
					break;				
				}
				case "Rot":{
					rot++;
					break;				
				}
				case "Grün":{
					gruen++;
					break;
				}
			}	
		}
		System.out.println("Weiss: " + weiss);
		System.out.println("Blau: " + blau);
		System.out.println("Rot: " + rot);
		System.out.println("Grün: " + gruen);
		
		
		return lieblingsFarbe;
	}
}
