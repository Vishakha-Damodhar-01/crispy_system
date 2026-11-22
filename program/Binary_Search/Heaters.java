problem no --> 475 Heaters
  Binary Search -->


  import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int radius = 0;
        int heaterIdx = 0;

        for (int house : houses) {
            while (heaterIdx + 1 < heaters.length &&
                   Math.abs(heaters[heaterIdx + 1] - house) <= Math.abs(heaters[heaterIdx] - house)) {
                heaterIdx++;
            }
            int distToNearest = Math.abs(heaters[heaterIdx] - house);
            radius = Math.max(radius, distToNearest);
        }

        return radius;
    }
}


//output:
Example 1:
Input: houses = [1,2,3], heaters = [2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.

Example 2:
Input: houses = [1,2,3,4], heaters = [1,4]
Output: 1
Explanation: The two heaters were placed at positions 1 and 4. We need to use a radius 1 standard, then all the houses can be warmed.

Example 3:
Input: houses = [1,5], heaters = [2]
Output: 3
