package xworkz.elevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Elevator");
		Elevator elevator=new Elevator();
		elevator.carry();
		elevator.carry(true);
		elevator.carry(true, "Machine-Room-Less");
		elevator.carry("Air Driven");
	}

}
