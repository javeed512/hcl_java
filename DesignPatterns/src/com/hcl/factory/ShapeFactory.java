package com.hcl.factory;

public class ShapeFactory {  // factory class

//return shapeObject by below method which takes input as particular shapeType (circle, Square or Rectangle)

	
	// factory method
	public Shape  getShapeObject(String shapeType){  // getShapeObject("Circle");
		
		
		Shape shapeObject = null;
		
			String key = shapeType.toUpperCase(); // CIRCLE
		
		switch (key) {
		
		case "CIRCLE":
					shapeObject = new  Circle();
				 
		break;
		
		case "SQUARE":
			
			shapeObject = new Square();
			
			break;
			
		case  "RECTANGLE":
			
			shapeObject =  new Rectangle();
				
		break;
		
		default:
			
			
			shapeObject = null;
		
	}
		
			return shapeObject;
	
	
}
	
	
}






