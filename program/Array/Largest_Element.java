
class Solution {
    public int removeElement(int[] nums, int val) {
        int elements=nums.length;
        int valcount=0;
        int count;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==val)
           {
            valcount+=1;
           }
           else
           {
            i++;
           }
        }
        count=elements-valcount;
        return count;
    }
}
