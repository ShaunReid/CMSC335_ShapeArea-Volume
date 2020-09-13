package Shapes;
/*
File name: Circle.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Circle class inherits dim1 and pi from both TwoDimShape and Shape.  Circle also implements area as required by TwoDimShape.   
 */
public class Circle extends TwoDimShape {

	//Circle constructor
	Circle(double inDim1) {
		super(inDim1);
		
	}

	//Calculates the area of a Circle object.
	@Override
	double area() {
		
		area = (dim1 * dim1) * pi;
		
		return area;
	}

}
