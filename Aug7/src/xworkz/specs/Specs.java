package xworkz.specs;

public class Specs {
	public  void lens() {
		System.out.println("Invoking main method of specs");
		lens(2.5);
		lens("convex");
		
	}
  
  public void lens(double power) {
		System.out.println("Invoking the  specs power");
		System.out.println("power:"+power);
	}
  public void lens(String type) {
		System.out.println("Invoking the specs type ");
		System.out.println("type:"+type);
	}


  public void hotel(double power,String type ) {
		System.out.println("Invoking the main hotel ");

	    lens(power);
	    lens(type);



  }

}
