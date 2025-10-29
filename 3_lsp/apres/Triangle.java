package lsp.apres;

public class Triangle implements Shape {
    private int base;
    private int height;
    
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public int getArea() {
        return (base * height) / 2;
    }
    
    public int getBase() { return base; }
    public int getHeight() { return height; }
}
