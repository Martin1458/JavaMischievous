/*
 * Beispiel für Java-Datenstrukturen "Bestellung" zur Vorlesung
 * "Softwaretechnologie".
 * (c) 2013-2021  Heinrich Hussmann und Uwe Aßmann, TU Dresden
 */
package bestellung;

public class Bestellposition {
    private Artikel artikel;
    private int anzahl;
    private int preis; // Standard: Artikelpreis, aber Sonderpreise möglich

    public Bestellposition(Artikel artikel, int anzahl) {
        this.artikel = artikel;
        this.anzahl = anzahl;
        preis = artikel.preis();
    }

    public int einzelpreis() {
        return preis;
    }

    public void einzelpreis(int sonderpreis) {
        preis = sonderpreis;
    }

    public int positionspreis() {
        return preis * anzahl;
    }

    @Override
    public String toString() {
        return anzahl + " x " + artikel + " Einzelpreis: " + preis + " Summe: " + positionspreis();
    }
}
