package com.xworkz.movie;

public abstract class MovieTrailer {
	
		public boolean sound()
		{
			System.out.println("invoking sound in Movie");
			return true;
		}
		public boolean  watch()
		{
			System.out.println("invoking watch in Movie");
			return true;
		}
		public boolean visualArt()
		{
			System.out.println("invoking visualArt in Movie");
			return true;
		}
		public boolean music()
		{
			System.out.println("invoking music in Movie");
			return true;
		}
		public boolean suspense()
		{
			System.out.println("invoking suspense in Movie");
			return true;
		}
		public abstract boolean thriller();
		public abstract boolean enjoy();
		public abstract boolean spendTime();
		public abstract boolean expression();
		public abstract boolean inspiration();

	

}
