class EmailArray{
	public static void main(String[] names){
		System.out.println("Running in the emails");
		String harshimail="harshij12@gmail.com";
		String anushamail="anusha42@gmail.com";
		String vanimail="vaninaravi06@gmail.com";
		String shreyamail="shreyashreya@gmail.com";
		String praneethmail="praneethparmady@gmail.com";
		String swasthikmail="swasthikjk@gmail.com";
		String pavanmail="pavankumar@gmail.com";
		String ashwinimail="ashwini456@gmail.com";
		
		String[] emails={harshimail,anushamail,vanimail,shreyamail,praneethmail,swasthikmail,pavanmail,ashwinimail};
		
		String ref1=emails[4];
		System.out.println("Email address of ref1 is:"+ref1);
		String ref2=emails[2];
		System.out.println("Email address of ref2 is:"+ref2);
		String ref3=emails[0];
		System.out.println("Email address of ref3 is:"+ref3);
	}
}