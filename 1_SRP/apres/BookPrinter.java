package srp.apres;

public class BookPrinter {
    
    public void printToScreen(BookSRP book) {
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }
    
    public void printToHTML(BookSRP book) {
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
    
    // On peut ajouter d'autres méthodes d'affichage sans impacter les autres classes
    public void printToConsole(BookSRP book) {
        System.out.println("**" + book.getTitle() + "**");
        System.out.println("*Auteur: " + book.getAuthor() + "*");
        System.out.println(book.getContent());
    }
}