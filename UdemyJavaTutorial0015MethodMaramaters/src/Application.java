class Robot {
	public void speak(String text) {  // In the parentaces I declared a String variable for the sam.speak to assign in to  
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}

public class Application {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam.");  // Passing a parameter to the Robot method
		sam.jump(7);
		sam.move("West", 12.2); // Remember to pass in the same order as the parameter list

	
		String greeting = "Hello there!";
		sam.speak(greeting);
		
	}
}
