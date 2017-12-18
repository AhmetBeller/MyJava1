package java1.lesson3.Ticketpreise;

import java.util.Scanner;

public class ticketpreise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Station 1 einlesen
		System.out.println("Station 1:");
		int stationsCode1 = scanner.nextInt();
		// Station 2 einlesen
		System.out.println("Station 2:");
		int stationsCode2 = scanner.nextInt();

		// Anzahl Hauptlinien
		int lines = 6;
		// suche den kleineren Stations-Code
		int codeMin = Math.min(stationsCode1, stationsCode2);
		// suche den grösseren Stations-Code
		int codeMax = Math.max(stationsCode1, stationsCode2);

		// trennen der Stations- und Liniennummern
		int lineMin = codeMin / 10;
		int stationMin = codeMin % 10;
		int lineMax = codeMax / 10;
		int stationMax = codeMax % 10;

		// Ticketpreis-Variable
		int preis;

		// Kurzstrecke entlang einer Hauptlinie, z.B. 23->24
		if (lineMin == lineMax && stationMin + 1 == stationMax) {
			preis = 1;
		}
		// Kurzstrecke entlang der Ringlinie, z.B. 23->33
		else if (stationMin == 3 && stationMax == 3 && lineMin + 1 == lineMax) {
			preis = 1;
		}
		// Kurzstrecke auf der Ringlinie von Linie 1 zur höchsten Linie, 13->63
		else if (stationMin == 3 && stationMax == 3 && lineMax == lines
				&& lineMin == 1) {
			preis = 1;
		}
		// Kurzstrecke vom und zum Zentrum, z.B. 00->11
		else if (stationMin + stationMax == 1) {
			preis = 1;
		}
		// Normale Strecke
		else {
			// Grundpreis
			preis = 2;
			// Eine Zonengrenze passieren Fall 1, z.B. 12->45
			if (stationMin < 4 && stationMax >= 4) {
				preis++;
			}
			// Eine Zonengrenze passieren Fall 2, z.B. 15->31
			else if (stationMin >= 4 && stationMax < 4) {
				preis++;
			}
			// Zwei Zonengrenzen passieren, z.B. 15->24
			else if (stationMin >= 4 && stationMax >= 4 && lineMax != lineMin) {
				preis += 2;
			}
			// Endstation Fall 1
			if (stationMin == 6) {
				preis++;
			}
			// Endstation Fall 2
			if (stationMax == 6) {
				preis++;
			}
		}

		System.out.println("Die Fahrt kostet: " + preis + ".-");

		scanner.close();
	}
}
