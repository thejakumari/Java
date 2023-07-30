package com.xworkz.store.boot;

import com.xworkz.store.app.Store;

public class StoreKiller {
	public static void main(String[] args) {
		
				System.out.println("Running main in Store......");
				
				String[] emails= {"tejapangala@gmail.com","swasthik@gmail.com","harshithaj@gmail.com","praneeth@gmail.com","shreya@gmail.com","pavan@gmail.com","vanishree@gmail.com"};
				Store store =new Store();
				store.email(emails);
				
				System.out.println("=================================================");
				
				String[] items= {"Rice","Vegetables","Milk","Cheese","Eggs","Wheat Flour","Butter"};
				Store store1 =new Store();
				store1.groceryItems(items);
				
		        System.out.println("=================================================");
				
				String[] teams= {"Royal Challengers Bangalore","Channai Super Kings","Gujarat Titans","Delhi Capitals","Mumbai Indians","Punjab Kings","Sunrisers Hyderbad"};
				Store store2 =new Store();
				store2.groceryItems(teams);
	}

}
