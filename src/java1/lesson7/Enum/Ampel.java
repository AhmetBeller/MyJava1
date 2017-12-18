package java1.lesson7.Enum;

public class Ampel {
	public enum AmpelFarbe {
		ROT, GELB, GRUEN
	};

	private AmpelFarbe ampelFarbe;

	public AmpelFarbe getAmpelFarbe() {
		return ampelFarbe;
	}

	public void setAmpelFarbe(AmpelFarbe ampelFarbe) {
		this.ampelFarbe = ampelFarbe;
	}

	public static void main(String[] args) {
		Ampel ampel = new Ampel();

		ampel.setAmpelFarbe(AmpelFarbe.ROT);
		System.out.println("Die Ampelfarbe ist: " + ampel.getAmpelFarbe());
		System.out.println();

		for (AmpelFarbe f : AmpelFarbe.values()) {
			System.out.println(f);
		}

	}

}
