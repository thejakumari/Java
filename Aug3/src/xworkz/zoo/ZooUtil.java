package xworkz.zoo;

public class ZooUtil {
	public static void save(Zoo zoo)
	{
		System.out.println("Zoo Type:"+zoo.type);
		zoo.protect();
		
	        if(zoo instanceof StateZoo)
		{
			StateZoo zoo1=(StateZoo)zoo;
			System.out.println("Zoo name:"+zoo1.name);
			zoo1.maintain();
		}
		if(zoo instanceof NationalZoo)
		{
			NationalZoo zoo2=(NationalZoo)zoo;
			System.out.println("Zoo number:"+zoo2.noOfZoo);
			zoo2.research();
		}
		

	}

}
