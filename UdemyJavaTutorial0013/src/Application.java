
class Person {

	// Instance variable (data or "state")
	String name;
	int age;
	String homeTown;
	String hairColor;
	String job;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		System.out.println("My name is" + " " + name + ", " + "I live in " + homeTown + " and my job is" + " " + job);
	}
	void sayHello() {
		System.out.println("Hello!");
	}
}

public class Application {

	public static void main(String[] args) {

		// Accesses the name & age variables on the top with the .(dot)

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.homeTown = "Leeds";
		person1.hairColor = "Blonde";
		person1.job = "Programmer";
		person1.sayHello();
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "John Shaft";
		person2.age = 35;
		person2.homeTown = "Hollywood";
		person2.hairColor = "Black";
		person2.job = "Badass";
		person2.sayHello();
		person2.speak();
		
		
		Person person3 = new Person();
		person3.name = "Eazy E";
		person3.age = 30;
		person3.homeTown = "Compton";
		person3.hairColor = "Black";
		person3.job = "Rapper";
		person3.sayHello();
		person3.speak();
		
		Person person4 = new Person();
		person4.name = "Rolf Aleksejunas Christensen";
		person4.age = 44;
		person4.homeTown = "Oslo";
		person4.hairColor = "Brown";
		person4.job = "Photographer & soon to be IT proffesional";
		person4.sayHello();
		person4.speak();
		
	}

}
