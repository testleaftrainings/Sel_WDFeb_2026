package week3.day3;

public class Toyota extends car {

	private void nameOfCar() {
		System.out.println("Glanza");
	}

	private void logo() {
		System.out.println("T");
	}

	public void colour() {
		System.out.println("Buisness Blue");
	}

	public static void main(String[] args) {

//		AutomobileParts objAuto = new AutomobileParts();
//		objAuto.Accellator();
//		objAuto.breaking();
//		objAuto.clutch();
//		objAuto.breaking();
//		objAuto.engine();
//		
//		
//		car objCar = new car();
//		objCar.designOfCar();

		Toyota objGlanza = new Toyota();
		objGlanza.Accellator();
		objGlanza.breaking();
		objGlanza.clutch();
		objGlanza.gearBox();
		objGlanza.engine();
		objGlanza.designOfCar();
		objGlanza.logo();
		objGlanza.nameOfCar();
	}
}
