package Shapes;
/*
File name: Cylinder.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Cylinder class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Cylinder also implements volume as required by ThreeDimShape.   
 */
public class Cylinder extends ThreeDimShape {

	//Cylinder constructor.
	Cylinder(double inDim1, double inDim2) {
		super(inDim1, inDim2);
		
	}

	////Calculates the volume of a Cylinder object.
	@Override
	double volume() {
		
		volume = (pi * dim2 * (dim1 * dim1));
		
		return volume;
	}

}
