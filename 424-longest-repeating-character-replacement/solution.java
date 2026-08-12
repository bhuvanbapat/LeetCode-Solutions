class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int[] freq = new int[26];
        int longest = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            max = Math.max(max, freq[ch - 'A']);
            while ((right - left + 1) - max > k) {
                freq[s.charAt(left) - 'A']--;
                left++;    
            }
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}