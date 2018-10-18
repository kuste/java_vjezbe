package ispit9zd01;

import java.util.Scanner;

/**
 * @author K
 *
 */
public class Tablet {

	private static int cnt = 1;
	private String manifacturer;
	private String OS;
	private String price;
	private int id;

	public Tablet() {
		
		cnt++;

	}



	public String getManifacturer() {
		return manifacturer;
	}



	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}



	public String getOS() {
		return OS;
	}



	public void setOS(String oS) {
		OS = oS;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setTabletData(Scanner input) {

		System.out.println("Enter tablet manufacutrer: ");
		setManifacturer(input.nextLine());
		System.out.println("Enter tablet id: ");
		setId(input.nextInt());
		input.nextLine();
		System.out.println("Enter tablet OS: ");
		setOS(input.nextLine());
		System.out.println("Enter tablet price: ");
		setPrice(input.nextLine());

	}

	@Override
	public String toString() {
		return "Manifacturer: " + manifacturer + " id:" + id + " OS: " + OS + " price: " + price;
	}

}
