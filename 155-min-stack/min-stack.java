class MinStack {
    int top = -1;
    int[] stack = new int[100000];
    int[] mintracker = new int[100000];

    public MinStack() {

    }

    public void push(int value) {
        if (top == stack.length - 1) {
            return;
        }
        top++;
        stack[top] = value;
        if (top == 0) {
            mintracker[top] = value;
        } else {
            mintracker[top] = Math.min(mintracker[top - 1], value);
        }
    }

    public void pop() {
        if (top == -1) {
            return;
        }
        top--;
    }

    public int top() {
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public int getMin() {
        return mintracker[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */