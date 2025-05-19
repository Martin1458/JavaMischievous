package collections1;

public class Demo {
    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek();

        bib.sortiertesEinfuegen(new Buch("2345", "Tolkien", "Der Hobbit"));
        bib.sortiertesEinfuegen(new Buch("1234", "Tolkien", "Der Herr der Ringe"));

        System.out.println("Suche nach Tolkien:");
        System.out.println(bib.sucheNachAutor("Tolkien"));

        System.out.println("Suche nach Lindgren:");
        System.out.println(bib.sucheNachAutor("Lindgren"));

        System.out.println("Suche nach ISBN 1234:");
        System.out.println(bib.sucheNachISBN("1234"));

        System.out.println("Suche nach ISBN 4321:");
        System.out.println(bib.sucheNachISBN("4321"));
    }
}
