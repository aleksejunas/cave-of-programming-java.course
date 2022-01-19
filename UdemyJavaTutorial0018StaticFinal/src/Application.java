// Static variables and methods
// Static methods can access static data, because both belong to the class
// The instance methods can access the static data
// If you have a method that takes some arguments and outputs some data, but never deals with the instance data of the class. Then you can make it static, you only 
// need instance methods if they somehow deal with the instance data in the class


class Thing {
	// These variables are usually private, but now they are public for convenience
	public String name;
	public static String description; // The static object has only one copy because it only belongs to the one class
	// Also called class variables

	public void showName() {
		System.out.println(description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		// Won't work: System.out.println(name);
	}
	
}

public class Application {

	public static void main(String[] args) {

		Thing.description = "I am a thing"; // How you access the static objects
		
		//System.out.println(Thing.description);
		
		Thing.showInfo();

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		thing1.name = "Bob";
		thing2.name = "Sue";

		/* Gets replaced by thing*.showName(); 
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		*/
		
		thing1.showName();
		thing2.showName();
		
		// A constant that is static  
		System.out.println(Math.PI);
	}

}
