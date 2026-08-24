class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth == 0) {
                    depth++;
                } else {
                    depth++;
                    result.append(c);
                }
            } else if (c == ')') {
                if (depth == 1) {
                    depth--;
                } else {
                    depth--;
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}