package com.xworkz.theater;

public class TheaterRunner {

	public static void main(String[] args) {
		
		Theater theatre=new StudioTheater();
		theatre.playMovies();
		theatre.playMovies("Alankar");
		theatre.playMovies("Alankar", "Udupi");
		theatre.playMovies("Alankar", "Udupi", "Mulitiplex");
		theatre.playMovies(40);
		theatre.playMovies("Mulitiplex", 40);
		System.out.println("=================");
		StudioTheater theatre1=new StudioTheater();
		theatre1.playMovies();
		theatre1.playMovies("Alankar");
		theatre1.playMovies("Alankar", "Udupi");
		theatre1.playMovies("Alankar", "Udupi", "Mulitiplex");
		theatre1.playMovies(40);
		theatre1.playMovies("Mulitiplex", 40);
		

	}

}
