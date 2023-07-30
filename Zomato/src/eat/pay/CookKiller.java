package eat.pay;

import eat.buy.Cook;
import eat.buy.Hotel;

public class CookKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in CookKiller");
		Cook cook = new Cook();
		cook.chef();
		cook.famousFood();
	}

}
