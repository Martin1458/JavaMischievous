package collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bibliothek {

    // bestand muss auf List spezialisiert werden wegen Anwendung
    // der Klasse Collections und des indizierten Zugriffs auf bestand
    private Set<Buch> bestand;

    public Bibliothek() {
        bestand = new HashSet<Buch>();
        // oder
        // bestand = new LinkedList<Buch>();
    }

    // Sortierung nach der ISBN
    public boolean sortiertesEinfuegen(Buch neuesBuch) {
        bestand.add(neuesBuch);  // HashSet.add() gibt false zurück, wenn das Buch bereits existiert
        //Collections.sort(bestand);
        return true;
    }

    public Buch sucheNachISBN(String isbn) {
        // Suche nach einem Buch mit der passenden ISBN
        for (Buch buch : bestand) {
            if (buch.getIsbn().equals(isbn)) {
                return buch;
            }
        }
        return null;
    }

    public Collection<Buch> sucheNachAutor(String autor) {
        // sequentielle Suche im Buchbestand
        Collection<Buch> suchergebnis = new HashSet<Buch>();
        for (Buch buch : bestand) {
            if (buch.getAutor().equals(autor)) {
                suchergebnis.add(buch);
            }
        }
        return suchergebnis;
    }
}
