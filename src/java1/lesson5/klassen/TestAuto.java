package java1.lesson5.klassen;

public class TestAuto {

	public static void main(String[] args) {

		Auto golf = new Auto();
		golf.setFarbe("Weiss");
		golf.setPreis(28000);
		golf.setHubraum((short)2000);	
		golf.print();
		
		Auto passat = new Auto();
		passat.setFarbe("Blau");
		passat.setPreis(23000);
		passat.setHubraum((short)1800);
		passat.print();
		
		Auto sharan = new Auto();
		sharan.setFarbe("Rot");
		sharan.setPreis(27000);
		sharan.setHubraum((short)1300);
		sharan.print();
		
		Auto sharan1 = new Auto();
		sharan1.setFarbe("Rot");
		sharan1.setPreis(27000);
		sharan1.setHubraum((short)1300);
		sharan1.print();
		
		Auto sharan2 = new Auto();
		sharan2.setFarbe("Rot");
		sharan2.setPreis(27000);
		sharan2.setHubraum((short)1300);
		sharan2.print();
		
		Auto sharan3 = new Auto();
		sharan3.setFarbe("Rot");
		sharan3.setPreis(27000);
		sharan3.setHubraum((short)1300);
		sharan3.print();
		
		Auto sharan4 = new Auto();
		sharan4.setFarbe("Rot");
		sharan4.setPreis(27000);
		sharan4.setHubraum((short)1300);
		sharan4.print();
		
		Auto sharan5 = new Auto();
		sharan5.setFarbe("Rot");
		sharan5.setPreis(27000);
		sharan5.setHubraum((short)1300);
		sharan5.print();
		
		Auto sharan6 = new Auto();
		sharan6.setFarbe("Rot");
		sharan6.setPreis(27000);
		sharan6.setHubraum((short)1300);
		sharan6.print();
		
		Auto sharan7 = new Auto();
		sharan7.setFarbe("Rot");
		sharan7.setPreis(27000);
		sharan7.setHubraum((short)1300);
		sharan7.print();
		
		System.out.println("Verkaufte Autos: " + Auto.getVerkaufteAutos() + " Stk.");
		System.out.println("Gesamtumsatz: " + Auto.getGesUmsatz());
		Auto.getLieblingsFarbe();
	}

}
