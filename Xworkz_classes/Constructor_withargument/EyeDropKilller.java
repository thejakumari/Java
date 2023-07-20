class EyeDropKilller{
	public static void main(String[] values){
		System.out.println("Invoking main in EyeDropKilller");
		EyeDrop drop=new EyeDrop();
		System.out.println("EyeDrop Name:"+drop.dropname);
		System.out.println("EyeDrop size:"+drop.size);
		System.out.println("EyeDrop cost:"+drop.cost);
		System.out.println("================================================");
		EyeDrop drop1=new EyeDrop("ciplox",25,98.0);
		System.out.println("EyeDrop Name:"+drop1.dropname);
		System.out.println("EyeDrop size:"+drop1.size);
		System.out.println("EyeDrop cost:"+drop1.cost);
	}
}