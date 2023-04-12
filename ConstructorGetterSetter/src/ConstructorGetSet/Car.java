package ConstructorGetSet;

public class Car {

		private String doors;
		private String engine;
		private String driver;
		private int speed;
		
		// speed inside method is parameter and its local variable,to access 
		//we need to give this.instance variable
		//(assigning to variable speed of class Car).
		
		public void setSpeed(int speed) {
			this.speed = speed;					
		}
		public int getSpeed() {
			return speed;
		}
		public String getDoors() {
			return doors;
		}
		public void setDoors(String doors) {
			this.doors = doors;
		}
		public String getEngine() {
			return engine;
		}
		public void setEngine(String engine) {
			this.engine = engine;
		}
		public String getDriver() {
			return driver;
		}
		public void setDriver(String driver) {
			this.driver = driver;
		}
		public String run() {
			if (doors.equals("Closed") && engine.equals("on") && driver.equals("seated") && speed>0 ) {
				return "running";
			}else
				return "not running";
		}
		
}

	


