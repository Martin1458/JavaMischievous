import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Bibliothek {
    public static final int ARRAYLIST = 1;
    public static final int LINKEDLIST = 2;

    private List<Buch> bestand;

    public Bibliothek(int variante) {
        switch (variante) {
        case ARRAYLIST:
            bestand = new ArrayList<Buch>();
            break;
        case LINKEDLIST:
            bestand = new LinkedList<Buch>();
            break;
        default:
            throw new IllegalArgumentException("unbekanntes Argument: " + variante);
        }
    }

    public void neuesBuchAufnehmen(Buch neuesBuch, Aufnehmen algorithmus) {
        algorithmus.neuesBuch(bestand, neuesBuch);
    }
}
