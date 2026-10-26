Queue:-->
problem no 933: Number of recent calls 

  import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        // Initialize an empty queue to hold request timestamps
        this.requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Add the current request time to the queue
        requests.add(t);
        
        // Remove all requests that fell out of the [t - 3000, t] window
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        
        // The remaining size represents the number of recent requests
        return requests.size();
    }
}
