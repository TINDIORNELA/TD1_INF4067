package srp.apres;

public class BookBusinessLogic {
    
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("\nEmprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }
    
    public void retourner(BookSRP book, String lecteur) {
        System.out.println("\nRetour du livre '" + book.getTitle() + "' par " + lecteur);
    }
    
    public void reserver(BookSRP book, String lecteur) {
        System.out.println("\nRéservation du livre '" + book.getTitle() + "' par " + lecteur);
    }
}