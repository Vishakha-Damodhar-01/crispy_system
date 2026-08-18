class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] counts = new int[26];
        
        // Count frequency of each character in both strings
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        // Verify if all counts are zero
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}


//output:
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
