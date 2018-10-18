package ispit9zd02;

public class Student extends Human implements Specific_abilities {

	private String University;

	public Student(String University) {
		this.University = University;
	}

	public void study() {
		System.out.println("Study is sometimes boring... ");
	}

	@Override
	public void jump() {
		System.out.println("You means bungee jumping?");
	}

	@Override
	public void communicate() {
		System.out.println("Mostly by using social networks or mail or cell phone... ");
	}

	@Override
	public void eat() {
		System.out.println("Eating three times in a day");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping - what is that :)...");

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "University = " + University + " name = " + name + " age = " + age;
	}

}
