package xworkz.ladder;

public class LadderRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in LadderRunner");
		Ladder ladder=new Ladder();
		ladder.fold("Foldable");
		ladder.fold("Foldable", 20);
		ladder.fold();
		ladder.fold(15);
	}

}
