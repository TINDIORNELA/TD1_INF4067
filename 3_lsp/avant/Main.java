package lsp.avant;

public class Main {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Largeur: 5, Hauteur: 4");
        System.out.println("Aire attendue: 20, Aire obtenue: " + rectangle.getArea());
        
       
        Rectangle carre = new Square();
        carre.setWidth(5);
        carre.setHeight(4); 
        
        System.out.println("Largeur: 5, Hauteur: 4");
        System.out.println("Aire attendue: 20, Aire obtenue: " + carre.getArea());
        System.out.println("VIOLATION LSP : Le comportement change après substitution!");
        
        System.out.println("\n=== Test setAspectRatio ===");
        try {
            carre.setAspectRatio(3, 4); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    

    public static void testerRectangle(Rectangle r) {
        r.setWidth(10);
        r.setHeight(5);
        int aireAttendue = 50;
        int aireObtenue = r.getArea();
        
        System.out.println("Aire attendue: " + aireAttendue + ", Aire obtenue: " + aireObtenue);
        if (aireAttendue != aireObtenue) {
            System.out.println("ERREUR: Violation du principe LSP!");
        }
    }
}