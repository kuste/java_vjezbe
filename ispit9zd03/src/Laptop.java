

import java.util.Scanner;

public class Laptop {
	private static int cnt = 1;
	private String manufacutrer;
	private int id;
	private String CPU;
	private String RAM;
	private String isSSD;
	private String price;

	public Laptop() {
		cnt++;
	}

	public String getManufacutrer() {
		return manufacutrer;
	}

	public void setManufacturer(String manufacutrer) {
		this.manufacutrer = manufacutrer;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getIsSSD() {
		return isSSD;
	}

	public void setIsSSD(String isSSD) {
		this.isSSD = isSSD;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setManufacutrer(String manufacutrer) {
		this.manufacutrer = manufacutrer;
	}

	public void setLaptopData(Scanner input) {
		System.out.println("Enter laptop manufacutrer: ");
		setManufacturer(input.nextLine());
		System.out.println("Enter laptop id: ");
		setId(input.nextInt());
		input.nextLine();
		System.out.println("Enter laptop RAM: ");
		setRAM(input.nextLine());
		System.out.println("Enter laptop CPU: ");
		setCPU(input.nextLine());
		System.out.println("Has SSD?");
		setIsSSD(input.nextLine());
		System.out.println("Enter laptop price: ");
		setPrice(input.nextLine());
	}

	@Override
	public String toString() {
		return "Manufacutrer: " + manufacutrer + " id: " + id + " RAM: " + RAM + " CPU: " + CPU + " SSD: " + isSSD
				+ " price: " + price;
	}

}
