package factory_pattern;
//ShapeFactory class that creates shape objects
 class ShapeFactory {
	 public static Shape createShape(String shapeType) {
	        Shape shape = null;
	        if (shapeType.equalsIgnoreCase("circle")) {
	            shape = new Circle();
	        } else if (shapeType.equalsIgnoreCase("square")) {
	            shape = new Square();
	        } else if (shapeType.equalsIgnoreCase("triangle")) {
	            shape = new Triangle();
	        }
	        return shape;
	    }
	}


