
public class L3Variables {
	
	public static void main(String[] args) {
	
		/*
		Informationen werden in Variablen gespeichert, die Positionen im Speicher kennzeichnen
		Auch in Java gibt es neben komplexen auch primitive Datentypen, etwa int und boolean
		Aus dem verwendeten Datentyp kann der Wert abgeleitet werden
		*/
		
		// Variablendeklarierung
		// Datentyp + Name
		// String ist ein komplexer Datentyp (char Array), daher groß geschrieben
		String name;
		byte monatAusbildungsbeginn; // 8 Bit
		short dauerAusbildungInMonaten; // 16 Bit
		int ausbildungsende; // 32 Bit
		long distanzAusbildungsbetriebBerufsschule; // 64 Bit
		boolean inAusbildung; // 1 Bit
		float verguetung; // 32 Bit
		double notenDurchschnitt; // 64 Bit
		
		// Was passiert mit einer Variable, die deklariert aber nicht initialisiert wird?
		// Kein Speicherplatz wird in Anspruch genommen
		
		// Initialisierung der Variablen
		name = "\"Ertu\"";
		monatAusbildungsbeginn = 9;
		dauerAusbildungInMonaten = 36;
		ausbildungsende = 2027;
		distanzAusbildungsbetriebBerufsschule = 9;
		inAusbildung = true;
		verguetung = 0.1f; // Dezimalpunkt statt -komma
		notenDurchschnitt = 5.0;
		char kursname = 'k'; // 16 Bit, in einfache Hochkomma, Hintergrund Unicode support
		
		// Ausgabe
		// Die Methode println kann offenbar mit verschiedenen Datentypen umgehen
		System.out.println(name);
		System.out.println(monatAusbildungsbeginn);
		System.out.println(dauerAusbildungInMonaten);
		System.out.println(ausbildungsende);
		System.out.println(distanzAusbildungsbetriebBerufsschule);
		System.out.println(inAusbildung);
		System.out.println(verguetung);
		System.out.println(notenDurchschnitt);
		System.out.println(kursname);	
		
		// Nach der geschweiften Klammer stehen die Variablen nicht mehr zur Verfügung
	}
}