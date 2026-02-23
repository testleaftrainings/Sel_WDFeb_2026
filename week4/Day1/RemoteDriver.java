package week4.day1;

public abstract class RemoteDriver implements WebDriver {
	// abstract class - interface - implliments

	@Override
	public void findElement() {
		System.out.println("findElement - From the abstract RemoteDriver");
	}

	@Override
	public void getTitle() {
		System.out.println("getTitle - From the abstract RemoteDriver");
	}

	// abstract class needs atleast 1 abstracrt method
	abstract void getCurrentUrl();

	// we can create both implemented & unimplemnted methods- abstract class

	public static void main(String[] args) {
		// Can we create object for abstract class? - no
		// RemoteDriver obj = new RemoteDriver();

		// in abstract can we create object for interface? - no
		// WebDriver obj = new WebDriver();
	}

}
