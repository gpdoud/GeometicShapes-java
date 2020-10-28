package com.maxtrain;

public class Mainline {

	public static void main(String[] args) {
		Quad q = new Quad(1, 2, 3, 4);
		String msg = String.format("Perimeter is %d", q.perimeter());
		System.out.println(msg);
		Rect r = new Rect(3, 5);
		System.out.println("Perimeter is " + r.perimeter() + ", and area is " + r.area());
		Sqr s = new Sqr(4);
		System.out.println("Perimeter is " + s.perimeter() + ", and area is " + s.area());
	}

}
