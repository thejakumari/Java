class PhotoFrameKilller{
	public static void main(String[] values){
		System.out.println("Invoking main in PhotoFrameKilller");
		PhotoFrame frame=new PhotoFrame();
		System.out.println("PhotoFrame type:"+frame.type);
		System.out.println("PhotoFrame no Of Photo:"+frame.noOfPhoto);
		System.out.println("PhotoFrame cost:"+frame.cost);
		System.out.println("================================================");
		PhotoFrame  frame1=new PhotoFrame("RectangularShape",9,5468.0);
		System.out.println("PhotoFrame type:"+frame1.type);
		System.out.println("PhotoFrame no Of Photo:"+frame1.noOfPhoto);
		System.out.println("PhotoFrame cost:"+frame1.cost);
	}
}