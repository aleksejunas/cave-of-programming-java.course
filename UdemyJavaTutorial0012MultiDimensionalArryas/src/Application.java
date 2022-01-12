
public class Application {

	public static void main(String[] args) {

		// int[] values = { 3, 5, 2343 };

		// System.out.println(values[1]);

		int[][] grid = { { 3, 5, 2343 }, // Row 1
				{ 2, 4 }, // Row 2
				{ 1, 2, 3, 4 } // Row 3
		};

		System.out.println(grid[0][2]); // Prints out with row first, then column

		System.out.println(grid[1][1]); // Prints out with row first, then column

		String[][] texts = new String[2][3]; // An array of array of strings

		texts[0][1] = "Hello There";

		System.out.println(texts[0][1]);

		// Nested for loop (a for loop within a for loop) First the row and then the
		// column
		
		// Use "\t" to add tabbed space (indent)

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			
			System.out.println();
		}
	}

}
