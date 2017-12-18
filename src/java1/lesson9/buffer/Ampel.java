package java1.lesson9.buffer;

public class Ampel {
	
	AmpelFarbe farbe;
	public enum AmpelFarbe{
		ROT, GRUEN, GELB;
	}
	
	public AmpelFarbe getFarbe() {
	return farbe;	
	}
	
	public void setFarbe(AmpelFarbe farbe){
		this.farbe = farbe;
	}

	public boolean fahrenErlaubt() {
		AmpelFarbe farbeHolen = farbe.GELB;
		boolean status;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
