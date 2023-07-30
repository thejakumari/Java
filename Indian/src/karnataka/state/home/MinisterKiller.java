package karnataka.state.home;

import karnataka.Constituency;
import karnataka.Minister;
import karnataka.state.Indiracanteen;

public class MinisterKiller {
	public static void main(String[] args) {
		System.out.println("Invoking the main in MinisterKiller");

		
		Minister minister=new Minister();
		
		String name=minister.name;
		System.out.println("Name is: " +name);
		
		int exp=minister.exp;
		System.out.println("Experience is: " +exp);
		
		System.out.println("*****************");
		
		Constituency constituency=minister.constituency;
		
		int constNo=constituency.constNo;
		System.out.println("ConstNumber is: " +constNo);
		
		double population=constituency.population;
		System.out.println("Population is: " +population);
		
		System.out.println("*****************");

		IndiraCanteen indiraCanteen=constituency.indiraCanteen;
		
		int breakFastPrice=indiraCanteen.breakFastPrice;
		System.out.println("IndiraCanteen breakfast price: " +breakFastPrice);
		
		int lunchPrice=indiraCanteen.lunchPrice;
		System.out.println("IndiraCanteen lunch price: "+lunchPrice);
		
		
		
		
	}

}
