package Shapes;
/*
File name: Rectangle.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Rectangle class inherits dim1 and dim2 from both TwoDimShape and Shape.  Rectangle also implements area as required by TwoDimShape.   
 */


public class Rectangle extends TwoDimShape {

	//Rectangle constructor
	Rectangle(double inDim1, double inDim2) {
		super(inDim1, inDim2);
		
	}

	//Calculates the area of a Rectangle object.
	@Override
	double area() {
		
		area = dim1 * dim2;
		return area;
	}

}
