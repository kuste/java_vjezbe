package ispit9zd01;

import java.util.Scanner;

public class Desktop_PC {

	private static int cnt = 1;
	private String manufacturer;
	private int id;
	private String CPU;
	private String RAM;
	private String isSSD;
	private String price;

	public Desktop_PC() {

		cnt++;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getRAM() {
		return RAM;
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

	public void setPCData(Scanner input) {
		System.out.println("Enter pc manufacutrer: ");
		setManufacturer(input.nextLine());
		System.out.println("Enter pc id: ");
		setId(input.nextInt());
		input.nextLine();
		System.out.println("Enter pc RAM: ");
		setRAM(input.nextLine());
		System.out.println("Enter pc CPU: ");
		setCPU(input.nextLine());
		System.out.println("Has SSD?");
		setIsSSD(input.nextLine());
		System.out.println("Enter pc price: ");
		setPrice(input.nextLine());
	}

	@Override
	public String toString() {
		return "Manufacturer: " + manufacturer + " id: " + id + " RAM: " + RAM + " CPU: " + CPU + " SSD: " + isSSD
				+ " price: " + price;
	}

}
