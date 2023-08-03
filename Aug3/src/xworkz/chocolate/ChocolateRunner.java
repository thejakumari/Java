package xworkz.chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
System.out.println("Running main in ChocolateRunner");
		
		Chocolate chocolate =new Chocolate();
		DarkChacolate darkChocolate=new DarkChacolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.eat(darkChocolate);
		
		ChocolateUtil.eat(caramelChocolate);

	}

}
