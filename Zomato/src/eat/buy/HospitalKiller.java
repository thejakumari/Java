package eat.buy;

public class HospitalKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in HospitalKiller");
		Hospital hospital=new Hospital();
		hospital.treatment();
		hospital.pharmacy();
	}

}
