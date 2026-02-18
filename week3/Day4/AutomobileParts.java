package week3.day3;

public class AutomobileParts {

	//Breaking
	//Clutch
	//Engine
	//GearBox
	//Accellator
	
	public void breaking() {
		System.out.println("breaking");

	}
	
	public void clutch() {
		System.out.println("clutch");

	}
	
	public void engine() {
		System.out.println("engine");

	}
	
	public void gearBox() {
		System.out.println("gearBox");

	}
	
	public void Accellator() {
		System.out.println("Accellator");

	}
	
	public static void main(String[] args) {
		
		//need to create an object and call/reuse the methods
		AutomobileParts car = new AutomobileParts();
		car.breaking();
		car.clutch();
		car.gearBox();
		car.Accellator();
		
		AutomobileParts auto = new AutomobileParts();
		auto.Accellator();
		auto.breaking();
	}
}
