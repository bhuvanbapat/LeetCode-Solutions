class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } 
            else if (s.equals("C")) {
                stack.pop();
            } 
            else if (s.equals("D")) {
                int d = stack.peek();
                d *= 2;
                stack.push(d);
            } 
            else {
                int a = Integer.parseInt(s);
                stack.push(a);
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}