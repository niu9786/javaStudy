public class Ex5_1 {
	private double amount = 0; //Amount of fuel in the tank
	private double cntSpeed = 0; //Current speed 
	private double efficiency = 0; //Efficiency of the boat's motor
	private double time = 0;
	public static final double capacity = 60.0; //Capacity of fuel tank
	public static final double maxSpeed = 50; //Maximum speed
	
	public boolean equals(Ex5_1 otherObject) {
		return (this.amount == otherObject.amount) &&
				(this.cntSpeed == otherObject.cntSpeed) &&
				(this.efficiency == otherObject.efficiency);
	}
	
	public void amountOfFuel(double time) {
		this.time = time;
		
		double fuelAtMax = efficiency * maxSpeed * maxSpeed * time;
		double fuelAtCur = efficiency * cntSpeed * cntSpeed * time;
		
		System.out.println("The amount of fuel used at the maximum speeds is " + fuelAtMax);
		System.out.println("The amount of fuel used at the current speeds is " + fuelAtCur);
	}
	public void travelDistanceTime() {
		
		double travelDstMax = maxSpeed * time;
		double travelDstCur = cntSpeed * time;
		
		System.out.println("The travel distance about time at the maximum speeds is " + travelDstMax);
		System.out.println("The travel distance about time at the current speeds is " + travelDstCur);
	}
	
	public double travelDistanceSpdFuel() {
		double result = 0;
		double cntSpeedD = (double)cntSpeed;
		double efficiencyD = (double)efficiency;
		
		result = amount / (cntSpeedD * efficiencyD);
		
		return result;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	public void setCntSpeed(double cntSpeed) {
		this.cntSpeed = cntSpeed;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double getEfficiency() {
		return this.efficiency;
	}
	
	public double getCntSpeed() {
		return this.cntSpeed;
	}
	

}