class PhotoFrame{
	String type;
	double cost;
	int noOfPhoto;
	PhotoFrame()
	{
		System.out.println("Invoking PhotoFrame without argument");
		System.out.println(this.type);
		System.out.println(this.cost);
		System.out.println(this.noOfPhoto);
		this.type="Rectangular";
		this.cost=3468.0;
		this.noOfPhoto=7;
	}
	 PhotoFrame(String type,int noOfPhoto,double cost)
	{
		System.out.println("Invoking PhotoFrame with argument");
		this.type=type;
		this.cost=cost;
		this.noOfPhoto=noOfPhoto;
	}
}