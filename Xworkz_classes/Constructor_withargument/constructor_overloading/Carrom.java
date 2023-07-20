class Carrom{
	float holeRadius;
	int boardSize;
	int boardOffset;
	double centerRadius;
	int noOfPlayer;
	Carrom()
	{
		System.out.println("Invoking the constructor without argument");
		System.out.println("Hole Radius:"+this.holeRadius);
		System.out.println("Board Offset:"+this.boardOffset);
		System.out.println("BoardSize:"+this.boardSize);
		System.out.println("Center Radius:"+this.centerRadius);
		System.out.println("Number Of Player:"+this.noOfPlayer);
		this.holeRadius=12.0f;
		this.boardOffset=18;
		this.boardSize=400;
		this.noOfPlayer=4;
		this.centerRadius=41.05;
		
	}
	Carrom(float holeRadius)
	{
	 System.out.println("Invoking the float constructor  in Carrom");
	 this.holeRadius=holeRadius;
	}
	Carrom(float holeRadius,int boardOffset)
	{
	 System.out.println("Invoking the float,int constructor  in Carrom");
	 this.holeRadius=holeRadius;
	 this.boardOffset=boardOffset;
	 
	}
	Carrom(float holeRadius,int boardOffset,int boardSize)
	{
	 System.out.println("Invoking the float,int constructor  in Carrom");
	 this.holeRadius=holeRadius;
	 this.boardOffset=boardOffset;
	 this.boardSize=boardSize;
	 
	}
	Carrom(float holeRadius,int boardOffset,int boardSize,int noOfPlayer)
	{
	 System.out.println("Invoking the float,int constructor  in Carrom");
	 this.holeRadius=holeRadius;
	 this.boardOffset=boardOffset;
	 this.boardSize=boardSize;
	 this.noOfPlayer=noOfPlayer;
	 
	}
	Carrom(float holeRadius,int boardOffset,int boardSize,int noOfPlayer,double centerRadius)
	{
	 System.out.println("Invoking the float,int constructor  in Carrom");
	 this.holeRadius=holeRadius;
	 this.boardOffset=boardOffset;
	 this.boardSize=boardSize;
	 this.noOfPlayer=noOfPlayer;
	 this.centerRadius=centerRadius;
	 
	}
}