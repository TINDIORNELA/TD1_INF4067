package lsp.avant;


public class Square extends Rectangle {
    
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); 
    }
    
    @Override
    public void setHeight(int height) {
        super.setWidth(height); 
        super.setHeight(height);
    }
    
    @Override
    public void setAspectRatio(int width, int height) {
        if (width != height) {
            throw new IllegalArgumentException("Un carré doit avoir des côtés égaux");
        }
        super.setAspectRatio(width, height);
    }
}