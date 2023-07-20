class WirelessKiller{
	public static void main(String[] values){
		System.out.println("invoking main in WirelessKiller");
		WirelessController controller=new WirelessController();
		System.out.println(controller.brand);
		System.out.println(controller.use);
		System.out.println(controller.price);
		System.out.println(controller.maximumRange);
		System.out.println(controller.otherName);
		controller.brand="Cosmic Byte Callisto";
		controller.use="To operate";
		controller.price=760;
		controller.otherName="Analog Stick";
		controller.maximumRange=7;
		System.out.println(controller.brand);
		System.out.println(controller.use);
		System.out.println(controller.price);
		System.out.println(controller.maximumRange);
		System.out.println(controller.otherName);
		System.out.println("##########################################");
		WirelessController controller1=new WirelessController();
		System.out.println(controller1.brand);
		System.out.println(controller1.use);
		System.out.println(controller1.price);
		System.out.println(controller1.otherName);
		System.out.println(controller1.maximumRange);
		controller1.brand="Cisco";
		controller1.use="To connect device to farther distance";
		controller1.price=500;
	    controller1.maximumRange=6;
		controller1.otherName="WLN";
		System.out.println(controller1.brand);
		System.out.println(controller1.use);
		System.out.println(controller1.price);
		System.out.println(controller1.otherName);
		System.out.println(controller1.maximumRange);
		
	}
}