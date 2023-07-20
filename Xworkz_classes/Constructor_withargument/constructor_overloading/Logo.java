class Logo{
	String name;
	int filesize; 
	float length;
	String design;
	String color;
	String color1;
	int fontsize;
	float width;
	String type;
	String source;
	Logo()
	{
		
		System.out.println("Invoking the constructor without argument");
		System.out.println("Logo name:"+this.name);
		System.out.println("Logo filesize:"+this.filesize);
		System.out.println("Logo length:"+this.length);
		System.out.println("Logo design:"+this.design);
		System.out.println("Logo color:"+this.color);
		System.out.println("Logo color1:"+this.color1);
		System.out.println("Logo fontSize :"+this.fontsize);
		System.out.println("Logo width:"+this.width);
		System.out.println("Logo type :"+this.type);
		System.out.println("Logo source:"+this.source);
		this.name="Domino's Pizza";
		this.filesize=200;
		this.length=7.0f;
		this.design="Graphic";
		this.color="Blue";
		this.color1="Red";
		this.fontsize=18;
		this.width=9.0f;
		this.type="Dynamic";
		this.source="Wikimedia Commons";
	}
	Logo(String name)
	{
		this.name=name;
	}
	Logo(String name,String source)
	{
		this.name=name;
		this.source=source;
	}
	Logo(String name,String source,int filesize)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
	}
		Logo(String name,String source,int filesize,float length)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
	}
	Logo(String name,String source,int filesize,float length,String design)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
	}
	Logo(String name,String source,int filesize,float length,String design,String color)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
		this.color=color;
	}
	Logo(String name,String source,int filesize,float length,String design,String color,String color1)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
		this.color=color;
		this.color1=color1;
	}
	Logo(String name,String source,int filesize,float length,String design,String color,String color1,int fontsize)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
		this.color=color;
		this.color1=color1;
		this.fontsize=fontsize;
	}
	Logo(String name,String source,int filesize,float length,String design,String color,String color1,int fontsize,float width)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
		this.color=color;
		this.color1=color1;
		this.fontsize=fontsize;
		this.width=width;
	}
	Logo(String name,String source,int filesize,float length,String design,String color,String color1,int fontsize,float width,String type)
	{
		this.name=name;
		this.source=source;
		this.filesize=filesize;
		this.length=length;
		this.design=design;
		this.color=color;
		this.color1=color1;
		this.fontsize=fontsize;
		this.width=width;
		this.type=type;
	}
}