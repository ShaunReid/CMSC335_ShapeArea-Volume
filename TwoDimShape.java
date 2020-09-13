package Shapes;
/*
File name: TwoDimShape.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The TwoDimShape class is an abstract class that inherits from Shape. TwoDimShape demands that it's children implement the area method.  
 */
public abstract class TwoDimShape extends Shape{

	double area;
	
	//Constructors for a two dimensional shape to be used by the specific shapes. 
	TwoDimShape(double inDim1){
		super(inDim1);
		NumberOfDimensions = 2;
	}
	
	TwoDimShape(double inDim1, double inDim2){
		super(inDim1, inDim2);
		NumberOfDimensions = 2;
	}
	
	//Abstract area method that requires an area method from TwoDimShape's children
	abstract double area();
	
	
}
