package com.xworkz.zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ZooRunner");

		Zoo zoo=new StateZoo();
		zoo.research();
		zoo.research(345, "BannerGhat");
		zoo.research(345);
		zoo.research(345, "BannerGhat", "Safari");
		zoo.research(345, "BannerGhat", "Safari",780);
		zoo.research(345, "BannerGhat", "Safari",780,"Bangalure");
		System.out.println("==========================");
		StateZoo zoo1=new StateZoo();
		zoo1.research();
		zoo1.research(345, "BannerGhat");
		zoo1.research(345);
		zoo1.research(345, "BannerGhat", "Safari");
		zoo1.research(345, "BannerGhat", "Safari",780);
		zoo1.research(345, "BannerGhat", "Safari",780,"Bangalure");
	}

}
