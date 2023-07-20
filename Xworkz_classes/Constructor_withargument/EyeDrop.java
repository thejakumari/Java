class EyeDrop{
	String dropname;
	double cost;
	int size;
	EyeDrop()
	{
		System.out.println("Invoking EyeDrop without argument");
		System.out.println(this.dropname);
		System.out.println(this.cost);
		System.out.println(this.size);
		this.dropname="ciplox";
		this.cost=68.0;
		this.size=10;
	}
	EyeDrop(String dropname,int size,double cost)
	{
		System.out.println("Invoking EyeDrop without argument");
		this.dropname=dropname;
		this.cost=cost;
		this.size=size;
	}
}










