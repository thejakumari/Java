package movie.xworkz.city;

import movie.xworkz.citycenter.Auditor;
import movie.xworkz.citycenter.Company;
import movie.xworkz.citycenter.Movie;
import movie.xworkz.citycenter.Producer;

public class MovieKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in MovieKiller");
         Movie movie=new Movie();
		
		String name=movie.name;
		System.out.println(name);
		
		String language=movie.language;
		System.out.println(language);
		
		System.out.println("================================");

		Producer producer=movie.producer;
		
		double budget=producer.budget;
		System.out.println(budget);

		long mobileNo=producer.mobileNo;
		System.out.println(mobileNo);

		System.out.println("====================================");

		Auditor auditor=producer.auditor;
		
		double aadharNo=auditor.aadharNo;
		System.out.println(aadharNo);
		
		System.out.println("================================");

		Company company=auditor.company;
		
		String companyname=company.companyname;
		System.out.println(companyname);
		
		String location=company.location;
		System.out.println(location);
		

		
		
	}

}
