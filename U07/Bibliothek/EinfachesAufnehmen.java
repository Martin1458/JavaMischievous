import java.util.List;

public class EinfachesAufnehmen implements Aufnehmen {
    @Override
    public void neuesBuch(List<Buch> liste, Buch buch) {
        liste.add(buch);
    }
}
