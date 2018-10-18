package ispit9zd02;

public class Triathlete extends Human implements Specific_abilities {
	private String triatClub;

	public Triathlete(String triatClub) {
		this.triatClub = triatClub;
	}

	@Override
	public void jump() {
		System.out.println("Try to avoid jumping... ");

	}

	@Override
	public void communicate() {
		System.out.println("Mostly by using social networks or mail... ");

	}

	@Override
	public void eat() {
		System.out.println("Eating three or more times in a day");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping whole time when trainig is off...");

	}

	public void run() {
		System.out.println("Running four times in a week.... ");
	}

	public void swim() {
		System.out.println("Swimming three times in a week ");
	}

	public void cycle() {
		System.out.println("Cycling five times in a week.... ");
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Club = " + triatClub + " name = " + name + " age = " + age;
	}

}
