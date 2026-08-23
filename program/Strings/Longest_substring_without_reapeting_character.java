class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        
        for(int i=0;i<n;i++)
        {
            boolean[] vish = new boolean[26];
            for(int j=i;j<n;j++)
            {
                if (vish[s.charAt(j) - 'a'] == true)
                    break;
                else 
                {
                    res = Math.max(res, j - i + 1);
                    vish[s.charAt(j) - 'a'] = true;
                }
            }
        }
        return res;
    }
}


//output:
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
