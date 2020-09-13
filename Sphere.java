package Shapes;
/*
File name: Sphere.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Sphere class inherits dim1 from both ThreeDimShape and Shape.  Sphere also implements volume as required by ThreeDimShape.   
 */

public class Sphere extends ThreeDimShape {

	//Sphere constructor.
	Sphere(double inDim1) {
		super(inDim1);
		
	}

	//Calculates the volume of a Sphere object.
	@Override
	double volume() {
		
		volume = (4 * pi * (dim1 * dim1 *dim1))/3;
		
		return volume;
	}

}
