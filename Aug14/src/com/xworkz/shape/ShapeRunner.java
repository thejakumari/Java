package com.xworkz.shape;

public class ShapeRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ShapeRunner");
		Shape shape=new CircleShape();
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculatePerimeter());
        System.out.println(shape.canRotate());
        System.out.println(shape.getName());
        System.out.println(shape.isConvex());
        System.out.println(shape.isRegular());
        System.out.println(shape.isSquare());
        System.out.println(shape.move());
        System.out.println(shape.redraw());
        System.out.println(shape.resize());

	}

}
