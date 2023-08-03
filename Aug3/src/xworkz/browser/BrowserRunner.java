package xworkz.browser;

public class BrowserRunner {

	public static void main(String[] args) {
System.out.println("Running main in BrowserRunner");
		
		Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		OperaBrowser opearBrowser=new OperaBrowser();
		FireFox fireFox =new FireFox();
		MicrosoftEdge microsftEdge=new MicrosoftEdge();
		
		BrowserUtil.run(chromeBrowser);
		
		BrowserUtil.run(opearBrowser);
		
		BrowserUtil.run(microsftEdge);
		
		BrowserUtil.run(fireFox);

	}

}
