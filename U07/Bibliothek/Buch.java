public class Buch implements Comparable<Buch> {
    private String isbn;
    private String titel;

    public Buch(String isbn, String titel) {
        this.isbn = isbn;
        this.titel = titel;
    }

    @Override
    public int compareTo(Buch buch) {
        return isbn.compareTo(buch.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Titel: " + titel;
    }
}
