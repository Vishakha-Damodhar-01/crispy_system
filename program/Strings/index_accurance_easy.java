// STrings --> problem 28. Find the Index of the First Occurrence in a String

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

      //so easy logic it is we just take a normal string named haystack and then count the index value of the intended string we want 
    }
}



//output:
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
