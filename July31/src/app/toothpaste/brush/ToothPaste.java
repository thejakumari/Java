package app.toothpaste.brush;

public class ToothPaste {
	public String pasteName;
	public String brand;
	public Company company;
	public Ingredient[] ingredients;
	
	public ToothPaste(String pastName, String brand, Company company, Ingredient[] ingredients) {
		
		this.pasteName=pastName;
		this.brand=brand;
		this.company=company;
		this.ingredients=ingredients;
		
	}
	
	public void printInfo() {
		
		System.out.println("Paste name: "+this.pasteName);
		System.out.println("Brand: "+this.brand);
		
		
		company.printInfo();
	
		for(int index=0;index < this.ingredients.length;index++)
		{
			
			System.out.println("Ingredients Details:");
			Ingredient ref=this.ingredients[index];
			ref.printInfo();
		
		
		}
	

	}
	
	

}
