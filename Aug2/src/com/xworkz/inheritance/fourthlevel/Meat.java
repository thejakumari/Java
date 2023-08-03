package com.xworkz.inheritance;

public class Meat extends Chicken {
    public int kg=2;
	public Meat() {
		
	System.out.println("no arg construct Meat");
	
}
public void cut() {
	System.out.println("Invoking cut() in Meat");
}

}
