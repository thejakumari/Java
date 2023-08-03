package xworkz.zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("Running main ZooRunner");

		Zoo zoo=new Zoo();

		StateZoo zoo1 = new StateZoo();

		NationalZoo zoo2 = new NationalZoo ();

		ZooUtil.save(zoo);
		ZooUtil.save(zoo1);
		System.out.println("***************************");
		ZooUtil.save(zoo2);

	

	}

}
