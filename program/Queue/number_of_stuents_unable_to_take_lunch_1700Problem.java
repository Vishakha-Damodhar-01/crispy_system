Queue  -->>>   Problem no 1700: The number of studnets unable to eat the luncb
problem --> https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/?envType=problem-list-v2&envId=queue
  

  class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Track the count of students who prefer type 0 (circular) and type 1 (square)
        int[] count = new int[2];
        for (int student : students) {
            count[student]++;
        }
        
        // Iterate through each sandwich in the stack
        for (int sandwich : sandwiches) {
            if (count[sandwich] > 0) {
                // A student who wants this sandwich takes it and leaves
                count[sandwich]--;
            } else {
                // No remaining student wants this top sandwich
                break;
            }
        }
        
        // The remaining students who couldn't eat
        return count[0] + count[1];
    }
}


//output:
Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
