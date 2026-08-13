class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == '(' || b == '{' || b == '[') {
                stack.push(b);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(' && b == ')' || stack.peek() == '{' && b == '}'
                        || stack.peek() == '[' && b == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
