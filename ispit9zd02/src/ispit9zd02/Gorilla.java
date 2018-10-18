package ispit9zd02;

public class Gorilla implements Specific_abilities {

	public static final String order = "Primate";
	public static final String speecies = "Gorilla";

	public Gorilla() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jump() {
		System.out.println("Only from one tree to another...");

	}

	@Override
	public void communicate() {
		System.out.println("I can't comunicate with humans.. ");

	}

	@Override
	public String toString() {
		return "Gorilla order " + order + " speecies " + speecies;
	}

}
