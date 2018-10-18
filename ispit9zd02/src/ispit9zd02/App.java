package ispit9zd02;

public class App {

	public static void main(String[] args) {

		System.out.println("//////////////////Student////////////////////");
		Student student = new Student("SIT zadar");
		student.setName("Venci");
		student.setAge(36);
		System.out.println(student);
		student.communicate();
		student.eat();
		student.jump();
		student.sleep();
		student.study();
		System.out.println("//////////////////Triathlete////////////////////");
		Triathlete triathlete = new Triathlete("Klub Zadar");
		triathlete.setName("Marin");
		triathlete.setAge(28);
		System.out.println(triathlete);
		triathlete.communicate();
		triathlete.cycle();
		triathlete.eat();
		triathlete.jump();
		triathlete.run();
		triathlete.sleep();
		triathlete.swim();
		System.out.println("//////////////////Gorilla////////////////////");
		Gorilla gorilla = new Gorilla();
		System.out.println(gorilla);
		gorilla.communicate();
		gorilla.jump();
	}

}
