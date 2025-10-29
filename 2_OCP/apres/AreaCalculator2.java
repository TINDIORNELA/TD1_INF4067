package ocp.apres;

public class AreaCalculator2 {
    
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    
    
    public double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }
}