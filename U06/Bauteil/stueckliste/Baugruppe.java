package stueckliste;
import java.util.*;


public class Baugruppe extends Bauteil {
    private double preis;
    private List<Bauteil> bauteile;
    private String id;

    public Baugruppe(String id, Bauteil teil){
        this.id = id;
        this.bauteile = new ArrayList<>();
        this.bauteile.add(teil);
    }

    @Override
    public double preis() {
        double gesamtpreis = 0;
        for (Bauteil b : bauteile) {
            gesamtpreis += b.preis();
        }
        return gesamtpreis;
    }

    public void addBauteil(Bauteil b) {
        bauteile.add(b);
    }

    public void removeBauteil(Bauteil b) {
        bauteile.remove(b);
    }
    public List<Bauteil> getBauteile() {
        return bauteile;
    }
    public String getId() {
        return id;
    }
}
