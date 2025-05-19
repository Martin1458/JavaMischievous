package collections1;

public class Buch implements Comparable<Buch> {
    // Bücher müssen vergleichbar sein wegen
    // Collections.binarySearch() und Collections.sort()

    private String isbn;
    private String autor;
    private String titel;

    public Buch(String isbn, String autor, String titel) {
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
    }

    public Buch(String isbn) {
        // Konstruktor für Hilfsobjekte zum Vergleichen von Büchern
        this(isbn, "", "");
    }

    @Override
    public int compareTo(Buch buch) {
        return isbn.compareTo(buch.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Autor: " + autor + ", Titel: " + titel;
    }

    // wenn man compareTo() überschreibt, sollte man equals()
    // und hashCode() analog dazu überschreiben, d.h. ebenfalls
    // isbn als Vergleichskriterium heranziehen

    @Override
    public boolean equals(Object o) {
        if (o instanceof Buch) {
            Buch buch = (Buch) o;
            return isbn.equals(buch.isbn);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
