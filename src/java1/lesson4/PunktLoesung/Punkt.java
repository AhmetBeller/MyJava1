package java1.lesson4.PunktLoesung;


public class Punkt 
{   
    private int xKoordinate; // x-Koordinate vom Typ int
    private int yKoordinate; // y-Koordinate vom Typ int
    
    public int getXKoordinate() {
        return xKoordinate;
    }
    public void setXKoordinate(int x) {
        xKoordinate = x;
    }
    public int getYKoordinate() {
        return yKoordinate;
    }
    public void setYKoordinate(int y) {
        yKoordinate = y;
    }    
    public void verschiebe(int xRichtung, int yRichtung){
        xKoordinate += xRichtung;
        yKoordinate += yRichtung;
    }
    
}   // Ende Klassenrumpf
