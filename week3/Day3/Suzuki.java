package week3.day3;

public class Suzuki extends Toyota{
	
	private void nameOfCar() {
		System.out.println("Baleon");
	}
	
	
	private void logo() {
		System.out.println("S");
	}
	

	public static void main(String[] args) {
		
		Suzuki objSuzuki = new Suzuki();
		objSuzuki.Accellator();
		objSuzuki.breaking();
		objSuzuki.clutch();
		objSuzuki.engine();
		objSuzuki.gearBox();
		objSuzuki.designOfCar();
		objSuzuki.colour();
		objSuzuki.logo();
		objSuzuki.nameOfCar();
	}

}
