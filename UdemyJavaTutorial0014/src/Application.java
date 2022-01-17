
// The person class is the idea of a person
class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
		
	int calculateYearsToRetirement() {  // This method returns a value of type int
		int yearsLeft = 67 - age;
			
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}





public class Application { 

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Rolf Aleksejunas Christensen";
		person1.age = 44;
		// person1.speak();
		
		int years = person1.calculateYearsToRetirement(); // Setting the variable equal to the return value of the method
		// which in this code being equal to the return of yearsLeft
		
		System.out.println("Years til retirement: " + years	);
		
		Person person2 = new Person();
		person2.name = "Rokas Eliot Aleksejunas Christensen";
		person2.age = 6;
		
		//person2.speak();
		person2.calculateYearsToRetirement();
		
		int age = person1.getAge();
		
		String name = person1.getName();

		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}
}
