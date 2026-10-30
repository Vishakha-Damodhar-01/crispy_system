Queue
problem no 2073--> time needed to buy tickets 

  
//There are 2 ways o solve thi sproblem
// 1.-->
  class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            // If the person is before or at position k, they can contribute up to tickets[k]
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                // If the person is after position k, they can contribute up to tickets[k] - 1
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        
        return time;
    }
}


// 2-->
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }
        
        int time = 0;
        while (!queue.isEmpty()) {
            time++;
            int curr = queue.poll();
            tickets[curr]--;
            
            if (curr == k && tickets[curr] == 0) {
                return time;
            }
            
            if (tickets[curr] > 0) {
                queue.offer(curr);
            }
        }
        return time;
    }
}
