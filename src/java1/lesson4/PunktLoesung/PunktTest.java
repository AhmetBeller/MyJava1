package java1.lesson4.PunktLoesung;

public class PunktTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aufgabe2();
        aufgabe3();
    }

    private static void aufgabe2() {
    	// Punkt 1 (3,0)
        Punkt p1 = new Punkt();
        p1.setXKoordinate(3);
        p1.setYKoordinate(0);
        // Punkt 2 (6,9)
        Punkt p2 = new Punkt();
        p2.setXKoordinate(6);
        p2.setYKoordinate(9);
        // a)
        System.out.println("*** Aufgabe 2 - a) ***");
        Punkt p3 = p1;
        print(p3);
        // b)
        System.out.println("*** Aufgabe 2 - b) ***");
        p3 = p2;
        print(p3);
        // c)
        System.out.println("*** Aufgabe 2 - c) ***");
        p3.setXKoordinate(7);
        print(p2);
    }

    private static void print(Punkt p) {
        System.out.println("x-Koordinate: " + p.getXKoordinate());
        System.out.println("y-Koordinate: " + p.getYKoordinate());
    }

    private static void aufgabe3() {
    	System.out.println("*** Aufgabe 3 ***");
        // Quadrat mit den Punkten (0,0)/(0,1)/(1,1)/(1,0)
        Punkt p1 = new Punkt();
        p1.setXKoordinate(0);
        p1.setYKoordinate(0);
        Punkt p2 = new Punkt();
        p2.setXKoordinate(0);
        p2.setYKoordinate(1);
        Punkt p3 = new Punkt();
        p3.setXKoordinate(1);
        p3.setYKoordinate(1);
        Punkt p4 = new Punkt();
        p4.setXKoordinate(1);
        p4.setYKoordinate(0);
        // automatische Generierung anhand Seitenlaenge 
        int seitenLaenge = 10;
        p1.setXKoordinate(seitenLaenge);
        p1.setYKoordinate(seitenLaenge);
        p2.setXKoordinate(seitenLaenge);
        p2.setYKoordinate(2 * seitenLaenge);
        p3.setXKoordinate(2 * seitenLaenge);
        p3.setYKoordinate(2 * seitenLaenge);
        p4.setXKoordinate(2 * seitenLaenge);
        p4.setYKoordinate(seitenLaenge);
        print(p1);
        print(p2);
        print(p3);
        print(p4);
        
    }
}