package Shapes;
/*
File name: Triangle.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Triangle class inherits dim1 and dim2 from both TwoDimShape and Shape.  Triangle also implements area as required by TwoDimShape.   
 */
public class Triangle extends TwoDimShape {

	//Triangle constructor
	Triangle(double inDim1, double inDim2) {
		super(inDim1, inDim2);
		
	}

	//Calculates the area of a Triangle object.
	@Override
	double area() {

		area = (dim1 * dim2)/2;
		
		return area;
	}

}
