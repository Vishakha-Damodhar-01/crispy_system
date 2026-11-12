Binary Search
  Problem no-->278 --> Bad search easy problem which we are gonna solve in java


  /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            // Prevent potential integer overflow
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid; // The first bad version is at mid or to the left
            } else {
                left = mid + 1; // The first bad version is to the right
            }
        }
        
        return left;
    }
}
