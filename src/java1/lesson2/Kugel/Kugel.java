package java1.lesson2.Kugel;

import java.util.Scanner;

public class Kugel{
    public static void main(String[] args) {
    	
    	// Scanner dient zum Einlesen von Kyboard Input
    	Scanner scanner = new Scanner(System.in);
    	
	    double duchmesser = scanner.nextInt();
	    double oberflache = Math.PI * Math.pow(duchmesser, 2);
	    
        System.out.println(oberflache);
        System.out.printf( "%1.2f", oberflache);
	    
	}
}
