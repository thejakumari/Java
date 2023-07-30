package state.district.taluk;

import state.district.village.Country;
import state.district.village.HomeMinister;
import state.district.village.PersonalAssitant;
import state.district.village.President;
import state.district.village.PrimeMinister;
import state.district.village.SecurityHead;
import state.district.village.StateFrom;

public class CountryKiller {
	public static void main(String[] args) {
		
	
	Country country=new Country();
	
	String name=country.name;
	System.out.println("Country name is: "+name);
	
    int code=country.code;
    System.out.println("Country code is: "+code);
    
    System.out.println("=====================================");

    
    President president=country.president;
    
    boolean presidentisFirstCitizen=president.presidentisFirstCitizen;
	 
    System.out.println(presidentisFirstCitizen);
    
    String presidentoffice=president.presidentoffice;
    System.out.println(presidentoffice);
    
    System.out.println("===============================================");

    PrimeMinister primeMinister=country.primeMinister;
    
    int salary=primeMinister.salary;
    System.out.println(salary);
    
    long aadharNo=primeMinister.aadharNo;
    System.out.println(aadharNo);

    System.out.println("==================================================");
       PersonalAssitant personalAssitant=primeMinister.personalAssitant;
    
    String paName=personalAssitant.paName;
    System.out.println(paName);
    
    String qualification=personalAssitant.qualification;
    System.out.println(qualification);;

    System.out.println("===================================");
    
    SecurityHead securityHead=primeMinister.securityHead;
    
    String securityHeadFrom=securityHead.securityHeadFrom;
    System.out.println(securityHeadFrom);
    
    double salary1=securityHead.salary;
    System.out.println(salary1);

    System.out.println("====================================");
     
    
    HomeMinister homeMinister=primeMinister.homeMinister;
    
    int age=homeMinister.age;
    System.out.println(age);
    
    String officelocation=homeMinister.officelocation;
    System.out.println(officelocation);
    
    System.out.println("=========================================");

    
    StateFrom stateFrom=president.stateFrom;
    
    String state=stateFrom.state;
    System.out.println(state);

   
    String profession=stateFrom.profession;
    System.out.println(profession);


    
    


	

    
    

	}

}
