package Shapes;
/*
File name: Cube.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Cube class inherits dim1 from both ThreeDimShape and Shape.  Cube also implements volume as required by ThreeDimShape.   
 */
public class Cube extends ThreeDimShape {

	//Cube constructor
	Cube(double inDim1) {
		super(inDim1);
		
	}

	//Calculates the volume of a Cube object.
	@Override
	double volume() {
		
		volume = dim1 * dim1 * dim1;
		
		return volume;
	}

}
