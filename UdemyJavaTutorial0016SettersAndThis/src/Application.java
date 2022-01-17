class Frog {
	String name;
	int age;
	
	// The this keyword is like a reference to the object you are in
	public void setName(String name) {
	 this.name  = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Application {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		// frog1.name = "Bertie";  // Setting an instance variable with equal sign
		// frog1.age = 1;
		
		frog1.setName("Bertie");  // Calling a method
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge()+ " years old");
		
	}
	
}
