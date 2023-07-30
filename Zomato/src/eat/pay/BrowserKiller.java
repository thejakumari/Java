package eat.pay;

import eat.buy.Browser;
import eat.buy.Internet;


public class BrowserKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in BrowserKiller");
		Browser browser=new Browser();
		browser.display();
		browser.retrieve();

	}

}
