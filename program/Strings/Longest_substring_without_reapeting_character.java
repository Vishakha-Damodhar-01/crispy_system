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
