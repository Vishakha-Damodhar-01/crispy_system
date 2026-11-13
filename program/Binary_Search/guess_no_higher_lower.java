problem no --> 374
  Guess the number higher or lower


  public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            
            if (res == 0) {
                return mid; // Found the picked number
            } else if (res < 0) {
                high = mid - 1; // Picked number is lower
            } else {
                low = mid + 1;  // Picked number is higher
            }
        }
        
        return -1;
    }
}
