class CarromKiller{
	public static void main(String[] values){
		System.out.println("Invoking the main in CarromKiller");
		Carrom carrom=new Carrom();
		System.out.println("Hole Radius:"+carrom.holeRadius);
		System.out.println("Board Offset:"+carrom.boardOffset);
		System.out.println("BoardSize:"+carrom.boardSize);
		System.out.println("Center Radius:"+carrom.centerRadius);
		System.out.println("Number Of Player:"+carrom.noOfPlayer);

		System.out.println("*********************************************************************");
		Carrom carrom1=new Carrom(12.05f);
		System.out.println("Hole Radius:"+carrom1.holeRadius);
		System.out.println("*********************************************************************");
		Carrom carrom2=new Carrom(13.06f,18);
		System.out.println("Hole Radius:"+carrom2.holeRadius);
		System.out.println("Board Offset:"+carrom2.boardOffset);
		System.out.println("*********************************************************************");
		Carrom carrom3=new Carrom(12.0f,18,450);
		System.out.println("Hole Radius:"+carrom3.holeRadius);
		System.out.println("Board Offset:"+carrom3.boardOffset);
		System.out.println("BoardSize:"+carrom3.boardSize);
		System.out.println("*********************************************************************");
		Carrom carrom4=new Carrom(13.02f,18,400,2);
		System.out.println("Hole Radius:"+carrom4.holeRadius);
		System.out.println("Board Offset:"+carrom4.boardOffset);
		System.out.println("BoardSize:"+carrom4.boardSize);
	    System.out.println("Number Of Player:"+carrom4.noOfPlayer); 
		System.out.println("*********************************************************************");
		Carrom carrom5=new Carrom(12.5f,18,460,4,43.05);
		System.out.println("Hole Radius:"+carrom5.holeRadius);
		System.out.println("Board Offset:"+carrom5.boardOffset);
		System.out.println("BoardSize:"+carrom5.boardSize);
		System.out.println("Center Radius:"+carrom5.centerRadius);
		System.out.println("Number Of Player:"+carrom5.noOfPlayer);
	}
}