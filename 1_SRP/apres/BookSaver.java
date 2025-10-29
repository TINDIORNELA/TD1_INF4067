package srp.apres;

public class BookSaver {
    
    public void saveToDatabase(BookSRP book) {
        System.out.println("\nSauvegarde de '" + book.getTitle() + "' en base de données...");
    }
    
    public void saveToFile(BookSRP book, String filename) {
        System.out.println("\nSauvegarde de '" + book.getTitle() + "' dans le fichier: " + filename);
    }
    
    // On peut ajouter d'autres méthodes de sauvegarde sans impacter les autres classes
    public void saveToCloud(BookSRP book, String cloudProvider) {
        System.out.println("\nSauvegarde de '" + book.getTitle() + "' sur " + cloudProvider);
    }
}
