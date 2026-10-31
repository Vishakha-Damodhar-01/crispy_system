Dynamic programming
  Problem no: Pascals triangle 2


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // The first element of any row is always 1
        long current = 1; 
        row.add((int) current);
        
        for (int i = 1; i <= rowIndex; i++) {
            // Calculate the next element based on the previous element
            current = current * (rowIndex - i + 1) / i;
            row.add((int) current);
        }
        
        return row;
    }
}
