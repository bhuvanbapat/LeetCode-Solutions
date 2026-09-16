class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(j);
            if (c1 == c2) {
                i++;
                j++;
            } else if (c1 != c2) {
                j++;
            }
        }
        return i == s.length();
    }
}