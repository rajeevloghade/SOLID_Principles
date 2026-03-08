public class Shape {
    public void draw() {
        // draw shape
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        // draw square
    }

    // Adding new shape type requires modification of existing classes
}

/**
 * Open Closed Principle (OCP): Software entities should be open for extension but closed for modification.
 * 
 * In this example, adding a new shape requires modifying existing classes, violating OCP. 
 */