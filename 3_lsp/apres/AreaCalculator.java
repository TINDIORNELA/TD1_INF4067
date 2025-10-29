package lsp.apres;


public class AreaCalculator {
    
    public int calculateArea(Shape shape) {
        return shape.getArea();
    }
    
    public int calculateTotalArea(Shape[] shapes) {
        int total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
    
    public void printArea(Shape shape) {
        System.out.println("Aire de la forme: " + shape.getArea());
    }
}