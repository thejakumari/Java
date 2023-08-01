package app.toothpaste.teeth;

import app.toothpaste.brush.Company;
import app.toothpaste.brush.Ingredient;
import app.toothpaste.brush.ToothPaste;

public class ToothPasteKiller {

	public static void main(String[] args) {
		System.out.println("Running main ToothpasteKiller");

		String pasteName = "Dabur Red";
		String brand = "Dabur";

		Company company = new Company("CloseUP", "Rohit", "India");

		Ingredient ingredient = new Ingredient("Lavanga", 5.8f, 10);

		Ingredient ingredient1 = new Ingredient("Salt", 6.90f, 28);

		Ingredient ingredient2 = new Ingredient("Garlic Powder", 0.56f, 8);

		Ingredient ingredient3 = new Ingredient("Ginger", 8.40f, 12);

		Ingredient ingredient4 = new Ingredient("Maricha", 10.700f, 38);

		Ingredient[] ingredients = { ingredient, ingredient1, ingredient2, ingredient3, ingredient4 };

		ToothPaste toothpaste = new ToothPaste(pasteName, brand, company, ingredients);
		toothpaste.printInfo();

	}

}
