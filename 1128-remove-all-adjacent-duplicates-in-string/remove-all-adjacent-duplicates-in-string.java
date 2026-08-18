class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder s1 = new StringBuilder();
        while (!stack.isEmpty()) {
            s1.append(stack.pop());
        }
        return s1.reverse().toString();
    }
}