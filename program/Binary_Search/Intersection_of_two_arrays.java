Binary Search -->
  problem no -350 --> Intersection of two  arryas II



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Use a map to store the frequency of each element in nums1
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // List to collect the intersection elements
        List<Integer> resultList = new ArrayList<>();

        // Traverse nums2 and check against the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // Decrement the count
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
