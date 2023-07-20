class SignalInfo{
	public static void main(String[] args){
		System.out.println("TRAFFIC SIGNAL");
		System.out.println();
		
		String colors = "Red";
		byte redTimings = 30;
		byte yelloTimings = 5;
		byte greenTimings = 20;
		String signalType = "LED";
		boolean isFlashing = true;
		byte pedestrianWaitTime = 20;
		String location = "Mejastic";
		String currentColor = "Yellow";
		byte vehicleCount = 50;
		String malfunctionStatus = "Faulty";
		byte sensorDistance = 10;
		String streetName= "Park Road";
		String powerSource = "Solar";
		boolean isSolarPowered =true;
		byte maintainenceInterval = 30;
		String signalMaterial = "Glass";
		String signalDesign = "Arrow";
		boolean hasCameras = false;
		char isEmergencyMode = 'Y';
		
		
		
		
		System.out.println("COLORS IN TRAFFIC SIGNAL -> "+colors);
		System.out.println("RED SIGNAL TIMINGS : "+redTimings);
		System.out.println("YELLOW SIGNAL TIMINGS : "+yelloTimings);
		System.out.println("GREEN SIGNAL TIMINGS : "+greenTimings);
		System.out.println("SIGNAL TYPE : "+signalType);
		System.out.println("IS LIGHT FLASHING : "+isFlashing);
		System.out.println("PEDESTRAIN WAIT TIME : "+pedestrianWaitTime);
		System.out.println("LOCATION : "+location);
		System.out.println("CURRENT COLOR : "+currentColor);
		System.out.println("VEHICLECOUNT : "+vehicleCount);
		System.out.println("MALFUNCTION STATUS : "+malfunctionStatus);
		System.out.println("SENSOR DISTANCE : "+sensorDistance);
		System.out.println("STRRET NAME : "+streetName);
		System.out.println("POWER SOURCE : "+powerSource);
		System.out.println("CHECK FOR SOLAR POWERED : "+isSolarPowered);
		System.out.println("MAINTAINNENCE INTERVAL "+maintainenceInterval);
		System.out.println("SIGNAL MATERIAL : "+signalMaterial);
		System.out.println("SIGNAL DESIGN : "+signalDesign);
		System.out.println("CHECK FOR PREDENCE OF CAMERA : "+hasCameras);
		System.out.println("CHECKING FOR EMERGENCY MODE : "+isEmergencyMode);
	}
}