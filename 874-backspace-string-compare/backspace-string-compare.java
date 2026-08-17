class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
            } else {
                stack1.push(c);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!stack2.isEmpty())
                    stack2.pop();
            } else {
                stack2.push(c);
            }
        }
        return stack1.equals(stack2);
    }
}