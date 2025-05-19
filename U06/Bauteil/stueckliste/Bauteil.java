package stueckliste;

public abstract class Bauteil {
    protected String id;

    public abstract double preis();

    public String getId() {
        return id;
    }
}
