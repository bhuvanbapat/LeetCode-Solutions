class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            left = Math.max(left, lastSeen[ch] + 1);

            lastSeen[ch] = right;

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}