class WeighingMachineKiller{
	public static void main (String[] values){
		System.out.println("Invoking main in WeighingMachineKiller");
		
		
		String machineType="Digital Weighing Machine";
		String scaleOfMeasure="Nominal";
		int machineCapacityInKg=100;
		String itemName="Sweets";
		
		
		String type="Analytical Weighing Machine";
		int machineCapacity=-10;
		
		WeighingMachine.measureWeight(machineType,scaleOfMeasure,machineCapacityInKg,itemName);
		System.out.println("");
		WeighingMachine.measureWeight(type,scaleOfMeasure,machineCapacity,itemName);
		
		
		
		
	}
}