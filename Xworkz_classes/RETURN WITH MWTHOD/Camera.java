class Camera{
	static void click(String location,String date,int noOfPeople,double resolutionInMP, String clarity,String cameraMan){
		System.out.println("Invoking click() in Camera");
		
		
		
		if(location!=null)
		{
			System.out.println("Location is valid:"+location);
			
		}
		else
		{
			System.err.println("Location is invalid:"+location);
			return;
		}
		
		if(date!=null)
		{
			System.out.println("Date is valid:"+date);
			
		}
		else
		{
			System.err.println("Date is invalid:"+date);
			return;
		}
		if(noOfPeople<=9)
		{
			System.out.println("Number of People is valid:"+noOfPeople);
			
		}
		else
		{
			System.err.println("Number of People is invalid:"+noOfPeople);
			return;
		}
		if(resolutionInMP<=20.9)
		{
			System.out.println("Number of People is valid:"+resolutionInMP);
			
		}
		else
		{
			System.err.println("Number of People is invalid:"+resolutionInMP);
			return;
		}
		if(clarity!=null)
		{
			System.out.println("Clarity is valid:"+clarity);
			
		}
		else
		{
			System.err.println("Clarity is invalid:"+clarity);
			return;
		}
		if(cameraMan!=null)
		{
			System.out.println("Camera Man is valid:"+cameraMan);
			
		}
		else
		{
			System.err.println("Camera Man is invalid:"+cameraMan);
			return;
		}
		
	}
}