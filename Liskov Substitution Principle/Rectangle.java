// Example violating LSP
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}

class Square extends Rectangle {
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
}

/**
 * Liskov Substitution Principle (LSP): Objects of a superclass should be
 * replaceable with objects of a subclass without affecting the correctness of the program.
 * 
 * In this example, Square violates LSP because it behaves differently from Rectangle. 
 * A square should not inherit from a rectangle.
 */