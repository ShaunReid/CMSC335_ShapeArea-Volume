package Shapes;
/*
File name: ThreeDimShape.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The ThreeDimShape class is an abstract class that inherits from Shape. ThreeDimShape demands that it's children implement the volume method  
 */
public abstract class ThreeDimShape extends Shape {

	double volume;
	
	//Constructors inherited by Shape
	ThreeDimShape(double inDim1){
		super(inDim1);
		NumberOfDimensions = 3;
	}
	
	ThreeDimShape(double inDim1, double inDim2){
		super(inDim1, inDim2);
		NumberOfDimensions = 3;
	}
	
	//Abstract class that requires three dimensional shapes to implement the volume method.  
	abstract double volume();
	
	
}
