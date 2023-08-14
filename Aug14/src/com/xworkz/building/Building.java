package com.xworkz.building;

public abstract class Building {
	public boolean exit()
	{
		return false;
	}
	public int getNumberOfFloors()
	{
		return 3;
	}
	public int elevator()
	{
		return 1;
	}
	public boolean lockDoors()
	{
		return true;
	}
	public boolean unlockDoors()
	{
		return true;
	}
	public  abstract boolean open();
    public abstract boolean close();
    public abstract boolean enter();
    public abstract boolean turnLightsOff();
    public abstract boolean turnLightsOn();
    
   
   
    





}







