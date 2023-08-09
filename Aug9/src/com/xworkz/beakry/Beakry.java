package com.xworkz.beakry;

public class Beakry {
	public void bake() {
		System.out.println("Invoking bake() in Beakry");
	}
	public void bake(String   beakryname) {
		System.out.println("Invoking   bake() with   String in beakry  ");
	}
	public void bake(String   beakryname,String    cake) {
		System.out.println("Invoking   bake() with   String,String in beakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces) {
		System.out.println("Invoking   bake() with   String,String, int in beakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces,double   price) {
		System.out.println("Invoking   bake() with   String,String, int,double in beakry  ");
	}
	public void bake(String   beakryname,String    cake,int noofpieces,double   price,String location) {
		System.out.println("Invoking   bake() with   String,String, int,double,String in beakry  ");
	}



}
