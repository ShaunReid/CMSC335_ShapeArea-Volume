package Shapes;
/*
File name: Square.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Square class inherits dim1 from both TwoDimShape and Shape.  Square also implements area as required by TwoDimShape.   
 */
public class Square extends TwoDimShape {

	//Square constructor
	Square(double inDim1) {
		super(inDim1);
	
	}

	//Calculates the area of a Square object.
	@Override
	double area() {
		
		area = dim1 * dim1;
		
		return area;
	}

	
}
