package java1.lesson9.buffer;

public class DoWhileSchlaufe {

	public static void main(String[] args) {
		// Aufgabe do-while-Schleife:
		int summe = 0;
		int n = 10;
/*		for (int i = 1; i <= n; i++) {
			summe = summe + i;
			System.out.println(summe);
		}
		System.out.println();
*/
		
		// Lösung do-while-Schleife:
		int i = 1;
		do {
			if(i <= n){
				summe = summe + i;
				i++;
				System.out.println(summe);	
			}
		} while (i <= n);
	}
}
