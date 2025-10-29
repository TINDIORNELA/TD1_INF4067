package lsp.avant;

public class Rectangle {
    protected int width;
    protected int height;
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getArea() {
        return width * height;
    }
    
    // Méthode utilitaire pour définir le ratio d'aspect
    public void setAspectRatio(int width, int height) {
        this.width = width;
        this.height = height;
    }
}