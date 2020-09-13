package Shapes;
/*
File name: Torus.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Torus class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Torus also implements volume as required by ThreeDimShape.   
 */

public class Torus extends ThreeDimShape {

	//Torus constructor
	Torus(double inDim1, double inDim2) {
		super(inDim1, inDim2);
		
	}

	//Calculates the volume of a Torus object. 
	@Override
	double volume() {
		
		volume = (pi *(dim2*dim2)) * (2 * pi * dim1);
		
		return volume;
	}

}
