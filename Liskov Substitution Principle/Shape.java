// Example following LSP
interface Shape {
    int area();
}

class Rectangle implements Shape {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}

/**
 * Now, Square and Rectangle both adhere to the Shape interface, 
 * and they can be substituted for each other without breaking the program's correctness.
 */