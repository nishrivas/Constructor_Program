package ConstructorGetSet;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setDoors("Closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());
		System.out.println("Branch1");
		

	}

}
