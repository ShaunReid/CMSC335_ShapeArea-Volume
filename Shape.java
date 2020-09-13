package Shapes;
/*
File name: Shape.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Shape class provides a framework for ThreeDimShape, TwoDimShape and all of its descendants.  
 */
public class Shape {

	//Constant used to represent pi
	static final double pi = 3.14;
	
	//Variables used throughout the inherited hierarchy.  
	double dim1;
	double dim2;
	
	//Gives the option to state the number of dimensions
	int NumberOfDimensions;
	
	//Basic Shape constructors used throughout the hierarchy. 
	Shape(double inDim1){
		dim1 = inDim1;
	}
	
	Shape(double inDim1, double inDim2){
		dim1 = inDim1;
		dim2 = inDim2;
	}
	
	
}
