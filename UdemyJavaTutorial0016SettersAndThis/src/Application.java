class Frog {
	String name;
	int age;
	String color;
	
	// The this keyword is like a reference to the object you are in
	
	public void setColor(String color) {
		this.color = color;
	}
	
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
	public String getColor() {
		return color;
	}
}

public class Application {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		// frog1.name = "Bertie";  // Setting an instance variable with equal sign
		// frog1.age = 1;
		
		frog1.setName("Bertie");  // Calling a method
		frog1.setAge(1);
		frog1.setColor("Orange");
		
		Frog frog2 = new Frog();
		frog2.setName("Froggie");
		frog2.setAge(2);
		frog2.setColor("Magenta");
		
		System.out.println(frog1.getName() + " the frog is ");
		System.out.println(frog1.getAge() + " years old" + " and it's color is ");
		System.out.println(frog1.getColor());
		
		System.out.println(frog2.getName() + " the frog is ");
		System.out.println(frog2.getAge() + " years old" + ", and it's color is ");
		System.out.println(frog2.getColor());
	}
	
}
