package myPackage;

public class Ex4_1 {
	int capacity = 0; //Capacity of fuel tank
	int amount = 0; //Amount of fuel in the tank
	int maxSpeed = 0; //Maximum speed
	int cntSpeed = 0; //Current speed 
	int efficiency = 0; //Efficiency of the boat's motor
	int time = 0;
		
	public static void main(String[] args) {
		Ex4_1 boatA = new Ex4_1();
		
		boatA.capacity = 60;
		boatA.amount = 8;
		boatA.maxSpeed = 50;
		boatA.cntSpeed = 20;
		boatA.efficiency = 10;
				
		boatA.amountOfFuel(5);
		boatA.travelDistanceTime();
		
		System.out.println("The travel distance for current speed and fuel amount is "+ boatA.travelDistanceSpdFuel());
	}
	public void amountOfFuel(int time) {
		this.time = time;
		
		int fuelAtMax = efficiency * maxSpeed * maxSpeed * time;
		int fuelAtCur = efficiency * cntSpeed * cntSpeed * time;
		
		System.out.println("The amount of fuel used at the maximum speeds is " + fuelAtMax);
		System.out.println("The amount of fuel used at the current speeds is " + fuelAtCur);
	}
	public void travelDistanceTime() {
		
		int travelDstMax = maxSpeed * time;
		int travelDstCur = cntSpeed * time;
		
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
}
