package week3.day3;

public class car extends AutomobileParts{
	
	public void designOfCar() {
		System.out.println("DesignNo:JYRGDTU7453778DG");
	}
	
	public static void main(String[] args) {
		AutomobileParts designCar = new AutomobileParts();
		designCar.Accellator();
		designCar.breaking();
		designCar.clutch();
		designCar.engine();
		
		//Simple Inheritence
		car objCar = new car();
		objCar.designOfCar();
		objCar.Accellator();
		objCar.breaking();
	}
}
