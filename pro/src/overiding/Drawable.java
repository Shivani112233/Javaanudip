package overiding;

public interface Drawable {
	void draw();
	}

	// Define the Shape class implementing Drawable
	class Shape implements Drawable {
	    private String shapeType;

	    public Shape(String shapeType) {
	        this.shapeType = shapeType;
	    }

	    @Override
	    public void draw() {
	        switch (shapeType.toLowerCase()) {
	            case "circle":
	                System.out.println("Drawing a circle: O");
	                break;
	            case "square":
	                System.out.println("Drawing a square: []");
	                break;
	            case "triangle": +
	                System.out.println("Drawing a triangle: /\\");
	                break;
	            default:
	                System.out.println("Drawing a generic shape.");
	                break;
	        }
	    }
	}

	// Define the Text class implementing Drawable
	class Text implements Drawable {
	    private String content;

	    public Text(String content) {
	        this.content = content;
	    }

	    @Override
	    public void draw() {
	        System.out.println("Displaying text: " + content);
	    }
	}

	