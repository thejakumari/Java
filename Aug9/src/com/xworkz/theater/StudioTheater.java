package com.xworkz.theater;

public class StudioTheater extends Theater {
	@Override
	public void playMovies() {
		System.out.println("Invoking playMovies in StudioTheatre");
	}
	
	public void playMovies(String name) {
		System.out.println("Invoking playMovies with name in StudioTheatre");
	}

	public void playMovies(String name,String location) {
		System.out.println("Invoking playMovies with name and location in StudioTheatre");
	}
	
	public void playMovies(String name,String location,String theatreType) {
		System.out.println("Invoking playMovies with name, location and theatreType in StudioTheatre");
	}
	
	public void playMovies(int noOfEmployees) {
		System.out.println("Invoking playMovies with noOfEmployees in StudioTheatre");
	}
	
	public void playMovies(String name,int noOfEmployees) {
		System.out.println("Invoking playMovies with name and noOfEmployees in StudioTheatre");
	}

}
