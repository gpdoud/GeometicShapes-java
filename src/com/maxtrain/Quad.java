package com.maxtrain;

public class Quad {

	protected int side1;
	protected int side2;
	protected int side3;
	protected int side4;
	
	public int perimeter() {
		return side1 + side2 + side3 + side4;
	}
	
	public Quad(int s1, int s2, int s3, int s4) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		side4 = s4;
	}
}
