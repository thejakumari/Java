package xworkz.mashroom;

public class RopeRunner {
	public static void main(String[] args) {
	    System.out.println("Running main in RopeRunner");
			
			NylonRope rope=new NylonRope();
			System.out.println("Rope type"+rope.type);
			System.out.println("Rope price"+rope.price);
			System.out.println("Rope Size"+rope.size);
			System.out.println("Rope Length"+rope.length);
			
			System.out.println("*************************");
			
			NylonRope rope1=new NylonRope("CottonRope",250,14,7.8);
			System.out.println("Rope Type"+rope1.type);
			System.out.println("Rope Price"+rope1.price);
			System.out.println("Rope Size"+rope1.size);
			System.out.println("Rope Length"+rope1.length);

		}


}
