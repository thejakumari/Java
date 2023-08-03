package xworkz.browser;

public class BrowserUtil {
public static void run(Browser browser) {
		
		System.out.println("Browser URL: "+browser.addressBar);
		browser.navigation();
		
		if(browser instanceof ChromeBrowser) {
			
			ChromeBrowser chrome=(ChromeBrowser)browser;
			
			System.out.println("ChromeBrowser type: "+chrome.url);
			chrome.sync();
		}
		

		if(browser instanceof OperaBrowser) {
			
			OperaBrowser opera=(OperaBrowser)browser;
			
			System.out.println("OperaBrowser origin country: "+opera.originCountry);
			opera.provideSecurity();
		}
		
		if(browser instanceof FireFox) {
			
			FireFox fire=(FireFox)browser;
			
			System.out.println("FireFox version: "+fire.version);
			fire.customize();
		}
		
		if(browser instanceof MicrosoftEdge) {
			
			MicrosoftEdge edge=(MicrosoftEdge)browser;
			
			System.out.println("MicrosoftEdge company: "+edge.company);
			edge.collectFeature();
		}
		
	}

}
