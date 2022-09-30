package myPackage;

public class Ex4_2a {
	private double amount = 0; //Amount of fuel in the tank
	private double cntSpeed = 0; //Current speed 
	private double efficiency = 0; //Efficiency of the boat's motor
	private double time = 0;
	public static final double capacity = 60.0; //Capacity of fuel tank
	public static final double maxSpeed = 50; //Maximum speed
	
	public static void main(String[] args) {
		Ex4_2a boatA = new Ex4_2a();
		
		boatA.setAmount(8);
		boatA.setEfficiency(10);
		boatA.setCntSpeed(20);
		
		if (boatA.getAmount() > capacity) 
			System.out.println("Error: the fuel amount can't exceed the fuel capacity");
		
		else if (boatA.getCntSpeed() > maxSpeed)
			System.out.println("Error: the current speeds can't exceed the max speeds.");
		
		else if (boatA.getAmount() < 0)
			System.out.println("Error: the fuel amount shouldn't be negative.");
		
		else if (boatA.getCntSpeed() < 0)
			System.out.println("Error: the current speeds shouldn't be negative.");
		
		else {
			boatA.amountOfFuel(5);
			boatA.travelDistanceTime();
			System.out.println("The travel distance for current speed and fuel amount is "+ boatA.travelDistanceSpdFuel());
		}
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
