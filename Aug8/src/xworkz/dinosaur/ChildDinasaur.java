package xworkz.dinosaur;

public class ChildDinasaur extends Dinasaru {
	@Override
	public void makeSound() {
		System.out.println("inovoking makesound() in ChildDinasaur");
		super.makeSound();
	}

}
