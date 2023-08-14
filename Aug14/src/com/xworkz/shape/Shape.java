package com.xworkz.shape;

public abstract class Shape {
	public boolean isSquare()
	{
		return false;
	}
	public double resize()
	{
		return 1.2;
	}
	public float redraw()
	{
		return 2.2f;
	}
	public boolean canRotate()
	{
		return true;
	}
	public boolean move()
	{
		return true;
	}
	public  abstract boolean calculateArea();
    public abstract boolean calculatePerimeter();
    public abstract boolean isConvex();
    public abstract boolean isRegular();
    public abstract String getName();

}
