Queue-->Problem no 387 -->First unique character in string 


  import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        // Frequency map to store the count of each character
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // Step 1: Count frequencies of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // Return -1 if no unique character exists
        return -1;
    }
}
