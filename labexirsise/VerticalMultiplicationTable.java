package labexirsise;

public class VerticalMultiplicationTable {
    public static void main(String[] args) {
        int rows = 12; // Number of rows (multiplicands: 1 to 12)
        int cols = 9;  // Number of columns (multipliers: 1 to 9)

        // Generate the table
        String[][] table = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int multiplicand = i + 1; // Rows: 1 to 12
                int multiplier = j + 1;    // Columns: 1 to 9
                int result = multiplicand * multiplier;
                table[i][j] = multiplier + "*" + multiplicand + "=" + result;
            }
        }

        // Print the table with borders
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf(" %-8s", table[i][j]); // Left-aligned, fixed width
            }
            System.out.println(" "); // End of row
          
        }
    }
}