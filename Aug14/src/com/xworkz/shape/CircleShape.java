package com.xworkz.shape;


public   class CircleShape extends Shape {
	@Override
	public  boolean calculateArea() {
		return true;
	
	}
	@Override
    public boolean calculatePerimeter()
    {
		return false;
	}
    @Override
    public boolean isConvex()
    {
		return false;
	}
    @Override
    public  boolean isRegular()
    {
		return true;
    }
    @Override
    public  String getName()
    {
		return "Square";
	}
    

}
