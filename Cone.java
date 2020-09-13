package Shapes;
/*
File name: Cone.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Cone class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Cone also implements volume as required by ThreeDimShape.   
 */
public class Cone extends ThreeDimShape {

	//Cone constructor
	Cone(double inDim1, double inDim2) {
		super(inDim1, inDim2);
		
	}

	//Calculates the volume of a Cone object.
	@Override
	double volume() {
		
		volume =  ((dim1 * dim1) * pi * dim2)/3;
		
		return volume;
	}

}
