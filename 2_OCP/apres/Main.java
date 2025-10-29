package ocp.apres;

public class Main {
    public static void main(String[] args) {
        AreaCalculator2 calculator = new AreaCalculator2();
        
        // Utilisation des différentes formes
        Shape rectangle = new Rectangle(4, 3);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(6, 4); 
        
        System.out.println("Aire du rectangle: " + calculator.calculateArea(rectangle));
        System.out.println("Aire du cercle: " + calculator.calculateArea(circle));
        System.out.println("Aire du triangle: " + calculator.calculateArea(triangle));
        
        // Calcul de l'aire totale
        Shape[] shapes = {rectangle, circle, triangle};
        System.out.println("Aire totale: " + calculator.calculateTotalArea(shapes));
        
        // Démonstration de l'extensibilité
        System.out.println("Pour ajouter un Carré, il suffit de créer une classe Square qui implémente Shape");
        System.out.println("Aucune modification de AreaCalculator2 nécessaire !");
    }
}
