package com.xworkz.beakry;

public class SweetBeakry extends Beakry {
	@Override
	public void bake() {
		System.out.println("Invoking bake() in SweetBeakry");
	}
	public void bake(String   beakryname) {
		System.out.println("Invoking   bake() with   String in SweetBeakry  ");
	}
	public void bake(String   beakryname,String    cake) {
		System.out.println("Invoking   bake() with   String,String in SweetBeakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces) {
		System.out.println("Invoking   bake() with   String,String, int in SweetBeakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces,double   price) {
		System.out.println("Invoking   bake() with   String,String, int,double in SweetBeakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces,double   price,String location) {
		System.out.println("Invoking   bake() with   String,String, int,double,String in beakry  ");
	}


}
