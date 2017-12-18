package java1.lesson7.Enum;

public class Woche {
	public enum Wochentag {
		MO(1), DI(2), MI(3), DO(4), FR(5), SA(6), SO(7);
		private int tag;

		private Wochentag(int t) {
			tag = t;
		}

		public int index() {
			return tag;
		}
	}

	private Wochentag wochentag;

	public Wochentag getWochentag() {
		return wochentag;
	}

	public void setWochentag(Wochentag wochentag) {
		this.wochentag = wochentag;
	}

	public static void main(String[] args) {
		
		Woche woche = new Woche();
		woche.setWochentag(Wochentag.MO);
	//	int o = woche.index();
		
		System.out.println("Der Wochentag ist :" + woche.getWochentag());
	//	System.out.println("Der Wochentag ist :" + woche.index();
	}

}
