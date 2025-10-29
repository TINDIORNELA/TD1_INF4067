package srp.avant;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        // Test des différentes responsabilités
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}