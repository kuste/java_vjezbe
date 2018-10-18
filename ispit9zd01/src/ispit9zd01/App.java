package ispit9zd01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Desktop_PC pc = new Desktop_PC();
		pc.setPCData(input);
		Laptop laptop = new Laptop();
		laptop.setLaptopData(input);
		Tablet tablet = new Tablet();
		tablet.setTabletData(input);
		System.out.println("/////////////////PC/////////////////");
		System.out.println(pc);
		System.out.println("/////////////////Laptop/////////////////");
		System.out.println(laptop);
		System.out.println("/////////////////Tablet/////////////////");
		System.out.println(tablet);
	

	}

}
