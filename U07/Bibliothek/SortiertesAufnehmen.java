import java.util.Collections;
import java.util.List;

public class SortiertesAufnehmen implements Aufnehmen {
    @Override
    public void neuesBuch(List<Buch> liste, Buch buch) {
        liste.add(buch);
        Collections.sort(liste);
    }
}
