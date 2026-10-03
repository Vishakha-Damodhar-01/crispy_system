118. Pascal's Triangle



  import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: if no rows are requested, return the empty list
        if (numRows == 0) {
            return triangle;
        }

        // Generate each row one by one
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            // The first element of every row is always 1
            row.add(1);

            // Calculate the middle elements of the row
            // Each element is the sum of the two elements directly above it
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = triangle.get(i - 1);
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element of every row is always 1 (if it's not the very first row)
            if (i > 0) {
                row.add(1);
            }

            // Add the completed row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}
