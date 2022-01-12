
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		
		String[][] grid = { 
			{"Danko Jones", "Frank Zappa", "Red Hot Chili Peppers"},
			{"Kendrick Lamar", "Public Enemy", "Childish Gambino"},
			{"Art Blakey", "Charles Mingus", "Dizzy Gillespie"},
		};
		
		// System.out.println(grid[0][0]);
		
		for(int row = 0; row < grid.length; i++) {
			for(col = 0; col < grid[row].length; col++) {
				System.out.print([grid][row][col] + "\t");
			}
		}
	}
	
}