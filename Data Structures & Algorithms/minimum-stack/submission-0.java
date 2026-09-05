class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
       st = new Stack<>();
       minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        // If minStack is empty OR current value <= current min
        if (minst.isEmpty() || val <= minst.peek()) {
            minst.push(val); // store it as new minimum
        }
    }

    // Remove top element
    public void pop() {
        int removed = st.pop();

        // If removed element is equal to current minimum
        if (removed == minst.peek()) {
            minst.pop(); // remove from minStack also
        }
    }

    // Get top element
    public int top() {
        return st.peek();
    }

    // Get minimum element in O(1)
    public int getMin() {
        return minst.peek();
    }
}
