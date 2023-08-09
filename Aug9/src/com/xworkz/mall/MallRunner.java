package com.xworkz.mall;

public class MallRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MallRunner");
		BestMall mall=new BestMall();
		mall.sale();
		mall.sale("Orion");
		mall.sale("Orion", 120);
		mall.sale("Orion", 120, true);
		mall.sale("Orion",120, false, 45.50);
		mall.sale("Orion", 120, false, 45.0, "Chats");
		System.out.println("=================");
		Mall mall1=new BestMall();
		mall1.sale();
		mall1.sale("Orion");
		mall1.sale("Orion", 120);
		mall1.sale("Orion", 120, true);
		mall1.sale("Orion",120, false, 45.50);
		mall1.sale("Orion", 120, false, 45.0, "Chats");
	}

}
