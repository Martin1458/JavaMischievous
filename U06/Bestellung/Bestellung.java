/*
 * Beispiel für Java-Datenstrukturen "Bestellung" zur Vorlesung
 * "Softwaretechnologie".
 * (c) 2013-2021  Heinrich Hussmann und Uwe Aßmann, TU Dresden
 */
package bestellung;

import java.util.Collection;
import java.util.Iterator;

public class Bestellung {
    private String kunde;
    private Collection liste;

    public Bestellung(String kunde) {
        this.kunde = kunde;
        liste = new MyCollection();
    }

    public void neuePosition(Bestellposition position) {
        liste.add(position);
    }

    public int auftragssumme() {
        Iterator iter = liste.iterator();
        int summe = 0;
        while (iter.hasNext()) {
            summe += ((Bestellposition) iter.next()).positionspreis();
        }
        return summe;
    }

    public void print() {
        System.out.println("Bestellung für Kunde " + kunde);
        Iterator iter = liste.iterator();
        int pos = 0;
        while (iter.hasNext()) {
            System.out.println(pos + ". " + iter.next());
            pos++;
        }
        System.out.println("Auftragssumme: " + auftragssumme());
        System.out.println();
    }

    public static void main(String[] args) {
        Artikel tisch = new Artikel("Tisch", 200);
        Artikel stuhl = new Artikel("Stuhl", 100);
        Artikel schrank = new Artikel("Schrank", 300);

        Bestellung bestellung = new Bestellung("TUD");
        bestellung.neuePosition(new Bestellposition(tisch, 1));
        bestellung.neuePosition(new Bestellposition(stuhl, 4));
        bestellung.neuePosition(new Bestellposition(schrank, 2));
        bestellung.print();
    }
}
