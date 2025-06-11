class MinStack {

    Stack<Integer> stack;
    Stack<Integer> stackMin;

    public MinStack() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (stackMin.isEmpty()) { stackMin.push(val); }
        else if (val <= stackMin.peek()) {stackMin.push(val); } 
    }
    
    public void pop() {
        int val = stack.peek();
        stack.pop();
        if (val == stackMin.peek())
            stackMin.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */