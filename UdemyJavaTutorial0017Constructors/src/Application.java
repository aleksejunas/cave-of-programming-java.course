// A constructor is a special method that is run every time you create an instance of your class
// The name of your constructor always have to have the same name as your class
// So we use them for initialization of instance variables
// As a method the constructor can also take 
// You can different methods with the same name, as long as you got different parameters to them
//  Java runs the right constructor depending on the parameter-list
class Machine {
	
	private String name; 
	private int code;
	
	public Machine() {  //  <----- The Constructor
		this("Arnie", 0);  // Calling the constructor with "this" (needs to be the first line)
		
		System.out.println("Constructor running!");
				
		// name = "Arnie";		// Using the constructor to set the default value of name
	}
	
	// Second constructor
	public Machine(String name) { // <---- And name by itself means this name variable 
		this(name, 0);
		System.out.println("Second constructor running!");
		this.name = name;  // Means the instance variable at the top(private String name;)
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
	
}

public class Application {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();  //  <---- An instance of the class
		
		Machine machine2 = new Machine("Bertha");
		
		Machine machine3 = new Machine("Olsen", 7);
		
	}
	
}
