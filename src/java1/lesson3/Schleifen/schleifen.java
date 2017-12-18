package java1.lesson3.Schleifen;

public class schleifen {
	// Einstiegspunkt des Programms
    public static void main(String[] args) {
    	System.out.println("Seite1 Übung 1.1a)"); {
    		int i = 1;
    		int a = 0;
    		while (i < 10){
    			a = a + i;
    			i = i + 1;
    			System.out.printf("%d ", a);
    		}
    	}
    	
    	System.out.println("\nSeite1 Übung 1.1b)");{
    		int i = 1;
    		while (i < 101){
    			System.out.printf("%d ", i);
    			i++;
    		}
    	}
    	
    	System.out.println("\nSeite1 Übung 1.2a)");{
    		int a = 1; // int a = 10;
    		do {
    			System.out.printf("%d ", a);
    			a++;
    		} while (a < 10);
    	}
    		
    	System.out.println("\nSeite1 Übung 1.2b)");{
    		int a = 1; // c = 10
    		while (a < 10){
    			System.out.printf("%d ", a);
    			a++;
    		}
    	}
    	
    	System.out.println("\nSeite2 Übung 1.1)");{ 
    		for (int counter = 1; counter < 101; counter++){
    			if ((counter%11) == 0){
    		    	System.out.printf("%d ", counter);
    			}
    			if (counter==100){
    			}
    			
    			if ((counter%17) == 0){
    		    	System.out.printf("%d ", counter);
    			}
    			if (counter == 100){
        		System.out.print("Sind durch 11 oder 17 teilbar");
    			}
    		}
    	}
    }
}


