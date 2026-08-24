class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a = 0, b = 0, c = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    c = b + a;
                    stack.push(c);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    c = b - a;
                    stack.push(c);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    c = b * a;
                    stack.push(c);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    if (a != 0) {
                        c = b / a;
                    }
                    stack.push(c);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}