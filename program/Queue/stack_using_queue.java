problem no 255
  Queue--> Implement stack using queue 

  import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Pushes element x to the top of the stack.
    public void push(int x) {
        // 1. Add the new element to the empty queue q2
        q2.add(x);
        
        // 2. Move all elements from q1 to q2 so that the new element is at the front
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        
        // 3. Swap the references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    // Removes the element on the top of the stack and returns it.
    public int pop() {
        return q1.poll();
    }
    
    // Returns the element on the top of the stack.
    public int top() {
        return q1.peek();
    }
    
    // Returns true if the stack is empty, false otherwise.
    public boolean empty() {
        return q1.isEmpty();
    }
}


//output:
Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
