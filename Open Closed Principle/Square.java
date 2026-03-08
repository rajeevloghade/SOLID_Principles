public class Square implements Shape {
    @Override
    public void draw() {
        // draw square
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        // draw circle
    }
}

// Example following OCP
interface Shape {
    void draw();
}

/**
 * Open Closed Principle (OCP): Software entities should be open for extension but closed for modification.
 * 
 * Now, to add a new shape, you just need to implement the Shape interface 
 * without modifying existing classes.
 */