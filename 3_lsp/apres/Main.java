package lsp.apres;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        Shape rectangle = new Rectangle(5, 4);
        Shape carre = new Square(5);
        Shape triangle = new Triangle(6, 4);
        
        testerForme(calculator, rectangle, "Rectangle");
        testerForme(calculator, carre, "Carré");
        testerForme(calculator, triangle, "Triangle");
        
        Shape[] formes = {rectangle, carre, triangle};
        int aireTotale = calculator.calculateTotalArea(formes);
        System.out.println("Aire totale des 3 formes: " + aireTotale);
       
        System.out.println("On peut ajouter n'importe quelle nouvelle forme");
        System.out.println("qui implémente l'interface Shape, sans modifier le calculateur!");
    }
    
    public static void testerForme(AreaCalculator calculator, Shape forme, String nomForme) {
        System.out.println(nomForme + " - Aire: " + calculator.calculateArea(forme));
    }
    
    public static void comparerAires(Shape forme1, Shape forme2) {
        int aire1 = forme1.getArea();
        int aire2 = forme2.getArea();
        
        System.out.println("Comparaison: " + aire1 + " vs " + aire2);
        if (aire1 > aire2) {
            System.out.println("La première forme a une aire plus grande");
        } else if (aire1 < aire2) {
            System.out.println("La deuxième forme a une aire plus grande");
        } else {
            System.out.println("Les deux formes ont la même aire");
        }
    }
}