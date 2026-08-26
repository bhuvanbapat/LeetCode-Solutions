class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    

    public StockSpanner() {   
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[] { price, span });
        return stack.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */