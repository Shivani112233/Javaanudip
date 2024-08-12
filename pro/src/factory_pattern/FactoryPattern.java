package factory_pattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// Create a circle using the factory
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw(); // Output: Drawing a circle.

        // Create a square using the factory
        Shape square = ShapeFactory.createShape("square");
        square.draw(); // Output: Drawing a square.

        // Create a triangle using the factory
        Shape triangle = ShapeFactory.createShape("triangle");
        triangle.draw(); // Output: Drawing a triangle.

	}

}
