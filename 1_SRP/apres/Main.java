package srp.apres;

public class Main {
    public static void main(String[] args) {
        // Création du livre
        BookSRP book = new BookSRP("Les principes SOLID", "Etudiants de MI-GL", "Révision des principes SOLID");
        
        // Utilisation des classes spécialisées
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic business = new BookBusinessLogic();
        
        // Chaque classe a une responsabilité unique
        printer.printToScreen(book);
        printer.printToHTML(book);
        
        saver.saveToDatabase(book);
        saver.saveToFile(book, "mon_livre.txt");
        
        business.emprunter(book, "Marcial");
        business.reserver(book, "Alice");
    }
}