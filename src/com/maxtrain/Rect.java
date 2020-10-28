package com.maxtrain;

public class Rect extends Quad {
	
	public int area() {
		return side1 * side2;
	}
	
	public Rect(int s1, int s2) {
		super(s1, s2, s1, s2);
	}
}
