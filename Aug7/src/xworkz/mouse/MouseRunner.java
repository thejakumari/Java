package xworkz.mouse;

public class MouseRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MouseRunner");

		Mouse mouse= new Mouse();
		mouse.mouse();
		
		mouse.mouse("Logitech",1000);


	}

}
