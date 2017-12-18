package java1.lesson4.Punkt;

public class PunktTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punkt p1 = new Punkt();
		p1.setXKoordinate(3);
		p1.setYKoordinate(0);

	//	p1.verschiebe(3, -2);

		Punkt p2 = new Punkt();
		p2.setXKoordinate(6);
		p2.setYKoordinate(9);

		Punkt p3 = new Punkt();
		p3 = p2;

		p3.setXKoordinate(7);
		p3.ausgabe();
		
		

	}

}
