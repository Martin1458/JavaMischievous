/*
 * Beispiel für Java-Datenstrukturen "Bestellung" zur Vorlesung
 * "Softwaretechnologie".
 * (c) 2013-2021  Heinrich Hussmann und Uwe Aßmann, TU Dresden
 */
package bestellung;

public class Artikel {
    private String name;
    private int preis;

    public Artikel(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public int preis() {
        return preis;
    }

    @Override
    public String toString() {
        return name;
    }
}
