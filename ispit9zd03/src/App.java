
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class App {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		ArrayList<?> lista1 = createList(3, 0);
		ArrayList<?> lista2 = createList(2, 1);
		ArrayList<?> lista3 = createList(2, 3);
		System.out.println("////////////////////DESKOPS////////////////////");
		for (Object O : lista1) {
			System.out.println("////////////////DESKTOP PC//////////////");
			System.out.println(O);
		}
		System.out.println("////////////////////LAPTOPS////////////////////");
		for (Object O : lista2) {
			System.out.println("////////////////LAPTOP//////////////");
			System.out.println(O);
		}
		System.out.println("////////////////////TABLETS////////////////////");
		for (Object O : lista3) {
			System.out.println("////////////////TABLET//////////////");
			System.out.println(O);
		}

	}

	public static Desktop_PC createDesktop() {
		Desktop_PC pc = new Desktop_PC();
		pc.setPCData(input);
		return pc;
	}

	public static Laptop createLaptop() {
		Laptop laptop = new Laptop();
		laptop.setLaptopData(input);
		return laptop;

	}

	public static Tablet createTablet() {
		Tablet tablet = new Tablet();
		tablet.setTabletData(input);
		return tablet;

	}

	public static ArrayList<?> createList(int num, int type) {

		switch (type) {

		case 0:
			ArrayList<Desktop_PC> lista1 = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				lista1.add(createDesktop());
			}
			return lista1;

		case 1:
			ArrayList<Laptop> lista2 = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				lista2.add(createLaptop());
			}
			return lista2;

		case 2:
			ArrayList<Tablet> lista3 = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				lista3.add(createTablet());
			}
			return lista3;

		default:
			System.out.println("Unjeli ste neispravan tip !");
		}
		return null;

	}

}
