
public class Application {
	
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "To";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits) { // Java will set the variable fruit to each of the values of the fruits array in turn
			System.out.println(fruit);
		}
		
		// All primitive types starts with a lower case letter
		
		int value = 123;
		
		String text = null; 
		
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "One";
	}
}
