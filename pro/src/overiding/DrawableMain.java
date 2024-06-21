package overiding;

public interface DrawableMain {
	 public static void main(String[] args) {
	        // Create Shape objects
	        Drawable circle = new Shape("circle");
	        Drawable square = new Shape("square");
	        Drawable triangle = new Shape("triangle");

	        // Create Text objects
	        Drawable greetingText = new Text("Hiii");
	        Drawable farewellText = new Text("so long");

	        // Draw shapes
	        circle.draw();
	        square.draw();
	        triangle.draw();

	        // Display texts
	        greetingText.draw();
	        farewellText.draw();
	    }
	}

